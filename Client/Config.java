import java.util.HashMap;
/**
 * Config  
 */
public final class Config {
    private static final String serverName =  "NNDScape";
    private static final String serverURL =  "https://nndscape.com";
    private static final String cacheURL = serverURL + "/caches/current.zip";
    private static final String loginMessage = "Welcome to " + serverName + " - Use the buttons below to design your character";
    private static final String donateURL = serverURL + "/donate";
    private static final String votingURL = serverURL + "/vote";

    private static HashMap<Integer, String> ranks = new HashMap<Integer, String>(){
        {
            put(1, "Sir");
            put(2, "Lady");
            put(3, "Boss");
            put(4, "Donor");
            put(5, "Dicer");
            put(6, "Trusted");
            put(7, "Owner");
            put(8, "Moderator");
        };
    };
    
    private Config() {
        ranks.put(1, "Sir");
        ranks.put(2, "Lady");
        ranks.put(3, "Boss");
        ranks.put(4, "Donor");
        ranks.put(5, "Dicer");
        ranks.put(6, "Trusted");
        ranks.put(7, "Owner");
        ranks.put(8, "Moderator");
    }

    public static String getServerName() {
        return serverName;
    }

    public static String getServerURL() {
        return serverURL;
    }

    public static String getCacheURL() {
        return cacheURL;
    }

    public static String getLoginMessage() {
        return loginMessage;
    }

    public static String getDonateURL() {
        return donateURL;
    }
    
    public static String getVotingURL() {
        return votingURL;
    }

    public static String getRankForID(int id){
        try {
            return ranks.get(id);
        } catch (Exception e) {
            return "";
        }
    }

}   