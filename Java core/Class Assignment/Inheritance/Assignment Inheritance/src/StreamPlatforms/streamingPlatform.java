package StreamPlatforms;

// Superclass
class streamingPlatform {
    String platformName;
    int activeUsers;
    double totalWatchHours;

    // Default constructor
    streamingPlatform() {
        this.platformName = "Unknown";
        this.activeUsers = 0;
        this.totalWatchHours = 0.0;
    }

    // Parameterized constructor
    streamingPlatform(String platformName, int activeUsers, double totalWatchHours) {
        this.platformName = platformName;
        this.activeUsers = activeUsers;
        this.totalWatchHours = totalWatchHours;
    }

    // Setters
    void setPlatform(String platformName, int activeUsers, double totalWatchHours) {
        this.platformName = platformName;
        this.activeUsers = activeUsers;
        this.totalWatchHours = totalWatchHours;
    }

    // Getters
    String getPlatformName() { return this.platformName; }
    int getActiveUsers() { return this.activeUsers; }
    double getTotalWatchHours() { return this.totalWatchHours; }

    // Common method
    void streamContent() {
        System.out.println("Streaming content on " + platformName + "...");
    }

    // Display
    void display() {
        System.out.println("Platform Name: " + platformName);
        System.out.println("Active Users: " + activeUsers);
        System.out.println("Total Watch Hours: " + totalWatchHours + " hrs");
        System.out.println("--------------------------------------");
    }
}

// Subclass 1 - YouTube
class YouTube extends streamingPlatform {
    int videoCount;
    String topCreator;
    int totalChannels;

    // Default constructor
    YouTube() {
        super();
        this.videoCount = 0;
        this.topCreator = "Unknown";
        this.totalChannels = 0;
    }

    // Parameterized constructor
    YouTube(int activeUsers, double totalWatchHours, int videoCount, String topCreator, int totalChannels) {
        super("YouTube", activeUsers, totalWatchHours);
        this.videoCount = videoCount;
        this.topCreator = topCreator;
        this.totalChannels = totalChannels;
    }

    // Override streamContent
    void streamContent() {
        System.out.println("▶ Streaming video on YouTube by creator: " + topCreator);
    }

    // Display details
    void display() {
        System.out.println("Platform Type: YouTube");
        super.display();
        System.out.println("Top Creator: " + topCreator);
        System.out.println("Total Videos: " + videoCount);
        System.out.println("Total Channels: " + totalChannels);
        System.out.println("--------------------------------------");
    }
}

// Subclass 2 - Twitch
class Twitch extends streamingPlatform {
    int activeStreamers;
    String topGame;
    int totalLiveStreams;

    // Default constructor
    Twitch() {
        super("Twitch", 140000000, 80000000.0);
        this.activeStreamers = 0;
        this.topGame = "Unknown";
        this.totalLiveStreams = 0;
    }

    // Parameterized constructor
    Twitch(int activeUsers, double totalWatchHours, int activeStreamers, String topGame, int totalLiveStreams) {
        super("Twitch", activeUsers, totalWatchHours);
        this.activeStreamers = activeStreamers;
        this.topGame = topGame;
        this.totalLiveStreams = totalLiveStreams;
    }

    // Override streamContent
    void streamContent() {
        System.out.println("🎮 Live streaming game: " + topGame + " on Twitch!");
    }

    // Display details
    void display() {
        System.out.println("Platform Type: Twitch");
        super.display();
        System.out.println("Active Streamers: " + activeStreamers);
        System.out.println("Top Game: " + topGame);
        System.out.println("Total Live Streams: " + totalLiveStreams);
        System.out.println("--------------------------------------");
    }
}

// Test class with main()
class TestStreamingPlatform {
    public static void main(String[] args) {

        // Create YouTube object
        YouTube yt = new YouTube(2500000, 180000000.0, 800000000, "MrBeast", 120000000);

        // Create Twitch object
        Twitch tw = new Twitch(150000000, 95000000.0, 8500000, "Valorant", 125000);

        // Display both
        yt.display();
        yt.streamContent();

        tw.display();
        tw.streamContent();
    }
}
