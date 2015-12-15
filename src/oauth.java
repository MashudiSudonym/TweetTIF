/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

import java.awt.Desktop;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author sudonym
 */
public class oauth {
    
    public static void main(String args) throws TwitterException {
        File file = new File("twitter4j.properties");
        Properties prop = new Properties();
        InputStream is = null;
        OutputStream os = null;
        if (null == prop.getProperty("lpbIEZzXY2ortNkUqlSQY5jWB")
                && null == prop.getProperty("M2VAPurkHEtld2O35qtVfdmdIOZZnyBUi6AGeiab351uIYOkQS")) {
            // consumer key/secret are not set in twitter4j.properties
            //System.out.println(
            //        "Usage: java twitter4j.examples.oauth.GetAccessToken [consumer key] [consumer secret]");
            //System.exit(-1);

        }
        try {
            Twitter twitter = new TwitterFactory().getInstance();
            RequestToken requestToken = twitter.getOAuthRequestToken();
            //System.out.println("Got request token.");
            //System.out.println("Request token: " + requestToken.getToken());
            //System.out.println("Request token secret: " + requestToken.getTokenSecret());
            
            AccessToken accessToken = null;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (null == accessToken) {
                //System.out.println("Open the following URL and grant access to your account:");
                //System.out.println(requestToken.getAuthorizationURL());
                try {
                    if(Desktop.isDesktopSupported()){
                        Desktop.getDesktop().browse(new URI(requestToken.getAuthorizationURL()));
                    }
                    
                } catch (UnsupportedOperationException | IOException ignore) {
                } catch (URISyntaxException e) {
                    throw new AssertionError(e);
                }
                //System.out.print("Enter the PIN(if available) and hit enter after you granted access.[PIN]:");
                //String pin = br.readLine();
                String pin = JOptionPane.showInputDialog(
                        null,
                        "Enter the PIN(if available) and hit enter after you granted access.[PIN]:");
                
                try {
                    if (pin.length() > 0) {
                        accessToken = twitter.getOAuthAccessToken(requestToken, pin);
                    } else {
                        accessToken = twitter.getOAuthAccessToken(requestToken);
                    }
                } catch (TwitterException te) {
                    if (401 == te.getStatusCode()) {
                        //System.out.println("Unable to get the access token.");
                        JOptionPane.showMessageDialog(
                                null,
                                "Unable to get the access token.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                    }
                }
            }
            //System.out.println("Got access token.");
            //System.out.println("Access token: " + accessToken.getToken());
            //System.out.println("Access token secret: " + accessToken.getTokenSecret());

            try {
                prop.setProperty("oauth.accessToken", accessToken.getToken());
                prop.setProperty("oauth.accessTokenSecret", accessToken.getTokenSecret());
                os = new FileOutputStream(file);
                prop.store(os, "twitter4j.properties");
                os.close();
            } catch (IOException ioe) {
                
                System.exit(-1);
            } finally {
                if (os != null) {
                    try {
                        os.close();
                    } catch (IOException ignore) {
                    }
                }
            }
            //System.out.println("Successfully stored access token to " + file.getAbsolutePath() + ".");
            //System.exit(0);
            JOptionPane.showMessageDialog(
                    null, 
                    "Successfully stored access token to " + file.getAbsolutePath() 
                            + ".\n\n\n" 
                            + "Please restart the application, before going into the timeline menu");
        } catch (TwitterException te) {
            
            //System.out.println("Failed to get accessToken: " + te.getMessage());
            //System.exit(-1);
            JOptionPane.showMessageDialog(
                    null, 
                    "Failed to get accessToken: " + te.getMessage());
        }
        
    }



    
}
