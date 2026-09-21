import java.util.Scanner;

public class NokiaPhone{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		
		boolean menuRunning = true;
		
		while (menuRunning){

      System.out.println("""

                 Welcome to NOKIA

              1  Phone-Book
              2  Messages
              3  Chat
              4  Call Register
              5  Tones
              6  Settings
              7  Call Divert
              8  Music
              9  Games
              10 Calculator
              11 Reminders
              12 Clock
              13 Profiles
              14 Services
              15 SIM services
              0  End

""");

System.out.println("Select One: ");
		int menu = input.nextInt();


		switch(menu)
  {
			case 1 -> 
	  {
	  boolean phoneBookRunning = true;
	  while (phoneBookRunning)
	  {
	    System.out.println( """
          
          Phone Book
      
      1  Search
      2  Service Nos.
      3  Add name
      4  Erase
      5  Edit
      6  Copy
      7  Assign tone
      8  Send b'card
      9  Options
      10 Speed dials
      11 Voice tags
      0  Back
      """);
			      System.out.println("Select your option: ");
			      int phoneBook = input.nextInt();
	      switch(phoneBook)
	      {
          case 1 -> System.out.println("Search");
          case 2 -> System.out.println("Service Nos.");
          case 3 -> System.out.println("Add name");
          case 4 -> System.out.println("Erase");
          case 5 -> System.out.println("Edit");
          case 6 -> System.out.println("Copy");
          case 7 -> System.out.println("Assign tone");
          case 8 -> System.out.println("Send b'card");
          case 9 -> {
                  boolean optionsRunning = true;
                  
                  while(optionsRunning)
                  {
                    System.out.println("""
          
                     Options
                            
                        1  Memory in use
                        2  Type of view
                        3  Memory status
                        0  Back                        
              """);       
                        System.out.print("Select one option: "); 
                        int options = input.nextInt();
                        
                    switch (options)
                    {
                      case 1 -> System.out.println("Memory in use");
                      case 2 -> System.out.println("Type of view");
                      case 3 -> System.out.println("Memory status");
                      case 0 -> optionsRunning = false;
                      default -> System.out.println("Try again.......");
                      }
                    }         
          
                  }
          
          case 10 -> System.out.println("Speed dials");
          case 11 -> System.out.println("Voice tags");
          case 0  -> phoneBookRunning = false;
          default -> System.out.println("Try again ......");
         } 
          }
      }
          
      case 2 -> {
          boolean messagesRunning = true;
          
          while (messagesRunning)
          {
          System.out.println("""
          
              Messages
          1  Write messages
          2  Inbox
          3  Outbox
          4  Picture messages
          5  Templates
          6  Smileys
          7  Message settings
          8  Info service
          9  Voice mailbox number
          10 Service command editor
          0  Back          
""");

            System.out.println("Select one option: ");
            int messages = input.nextInt();
            
            switch(messages)
            {
                case 1 -> System.out.println("Write messages");
                case 2 -> System.out.println("Inbox");
                case 3 -> System.out.println("Outbox");
                case 4 -> System.out.println("Picture messages");
                case 5 -> System.out.println("Templates");
                case 6 -> System.out.println("Smileys");
                case 7 -> {
                   boolean messageSettingsRunning = true;
                   while (messageSettingsRunning)
                    {
                
                    System.out.println("""
                
                            Message settings
                            
                        1  Set 1
                        2  Common
                        0  Back                        
              """);
                
                    System.out.print("Select one option: ");
                    int messageSettings = input.nextInt();
                    
                    switch (messageSettings)
                    {
                        case 1 -> {
                            boolean set1Running = true;
                            while(set1Running)
                            {
                            
                            System.out.println("""
                 
                              Set 1
                          1 Message centre number
                          2 Messages sent as
                          3 Message validity
                          0 Back                          
                    """);
                          
                        System.out.print("Select one option: "); 
                        int set1 = input.nextInt();
                        
                    switch (set1)
                    {
                      case 1 -> System.out.println("Message centre number");
                      case 2 -> System.out.println("Messages sent as");
                      case 3 -> System.out.println("Message validity");
                      case 0 -> set1Running = false;
                      default -> System.out.println("Try again.......");
                      }
                    }
                  }
                       case 2 -> {
                        boolean commonRunning = true;
          
                       while (commonRunning)
                        {
                       
                       
                       
                            System.out.println("""
                 
                              Common
                              
                          1 Delivery reports
                          2 Reply via same centre
                          3 Character support                          
                    """);
                          
                        System.out.print("Select one option: "); 
                        int common = input.nextInt();
                        
                    switch (common)
                    {
                      case 1 -> System.out.println("Delivery reports");
                      case 2 -> System.out.println("Reply via same centre");
                      case 3 -> System.out.println("Character support");
                      case 0 -> commonRunning = false;
                      default -> System.out.println("Try again.......");
                      }
                    }
                  }    
                  
                      case 0 -> messageSettingsRunning = false;
                      default -> System.out.println("Try again.......");
                    }
                }
              }
             
                case 8 -> System.out.println("Info service");
                case 9 -> System.out.println("Voice mailbox number");
                case 10 -> System.out.println("Service command editor");
                case 0 -> messagesRunning = false;
                default -> System.out.println("Try again ......");
              }
            }
           } 
            case 3 -> System.out.println("Chat");
            
            case 4 -> {
                  boolean callRegisterRunning = true;
                  while (callRegisterRunning)
                  {
            
                System.out.println("""
                       
                     Call Register
                        
                  1 Missed calls
                  2 Received calls
                  3 Dialled numbers
                  4 Erase recent call lists
                  5 Show call duration
                  6 Show call costs
                  7 Call cost settings
                  8 Prepaid credit
                  0 Back                  
""");  
                System.out.print("Select one option: ");
                int callRegister = input.nextInt();

                switch(callRegister)
                {
                case 1 -> System.out.println("Missed calls");
                case 2 -> System.out.println("Received calls");
                case 3 -> System.out.println("Dialled numbers");
                case 4 -> System.out.println("Erase recent call lists");
                case 5 -> {
                        boolean showCallDurationRunning = true;
                        while(showCallDurationRunning)
                        {
                
                
                
                    System.out.println("""
                
                          Show call duration
                          
                      1  Last call duration
                      2  All calls’ duration
                      3  Received calls’ duration
                      4  Dialled calls’ duration
                      5  Clear timers
                      0  Back                      
                """);
                  
                       System.out.print("Select one option: "); 
                        int showCallDuration = input.nextInt();
                        
                    switch (showCallDuration)
                    {
                      case 1 -> System.out.println("Last call duration");
                      case 2 -> System.out.println("All calls’ duration");
                      case 3 -> System.out.println("Received calls’ duration");
                      case 4 -> System.out.println("Dialled calls’ duration");
                      case 5 -> System.out.println("Clear timers");
                      case 0 -> showCallDurationRunning = false;
                      default -> System.out.println("Try again.......");
                      }
                    } 
                  }
                case 6 -> {
                        boolean showCallCostsRunning = true;
                        while (showCallCostsRunning)
                        {
                
                
                      System.out.println("""
                
                          Show call costs
                          
                      1  Last call cost
                      2  All calls’ cost
                      3  Clear counters
                      0  Back
                      
              """);
                    System.out.print("Select one option: "); 
                        int showCallCosts = input.nextInt();
                        
                    switch (showCallCosts)
                    {
                      case 1 -> System.out.println("Last call cost");
                      case 2 -> System.out.println("All calls’ cost");
                      case 3 -> System.out.println("Clear counters");
                      case 0 -> showCallCostsRunning = false;
                      default -> System.out.println("Try again.......");
                      }
                    } 
                  }
                case 7 -> {
                      boolean callCostSettingRunning = true;
                      while (callCostSettingRunning)
                      {
                      System.out.println("""
                
                          Call cost settings

                      1  Call cost limit
                      2  Show costs in
                      0  Back
                      
              """);
                    System.out.print("Select one option: "); 
                        int callCostSettings = input.nextInt();
                        
                    switch (callCostSettings)
                    {
                      case 1 -> System.out.println("Call cost limit");
                      case 2 -> System.out.println("Show costs in");
                      case 0 -> callCostSettingRunning = false;
                      default -> System.out.println("Try again.......");
                      }
                    } 
                  }
                case 8 -> System.out.println("Prepaid credit");
                case 0 -> callRegisterRunning = false;
                default -> System.out.println("Try again ......");
              }
            }
          } 
             case 5 -> {
                  boolean tonesRunning = true;
                  while (tonesRunning)
                  {
                  System.out.println("""
                  
                          Tones
                          
                    1 Ringing tone
                    2 Ringing volume
                    3 Incoming call alert
                    4 Message alert tone
                    5 Keypad tones
                    6 Warning tones
                    7 Vibrating alert
                    8 Screen saver
                    0 Back                    
""");

                System.out.println("Select one option: ");
                int tones = input.nextInt();
                
            switch(tones)
            {
                case 1 -> System.out.println("Ringing tone");
                case 2 -> System.out.println("Ringing volume");
                case 3 -> System.out.println("Incoming call alert");
                case 4 -> System.out.println("Message alert tone");
                case 5 -> System.out.println("Keypad tones");
                case 6 -> System.out.println("Warning tones");
                case 7 -> System.out.println("Vibrating alert");
                case 8 -> System.out.println("Screen saver");
                case 0 -> tonesRunning = false;
                default -> System.out.println("Try again ......");
            }
          }
         } 
          case 6 -> {
                boolean settingsRunning = true;
                while(settingsRunning)
                {
                System.out.println("""
              
                    Settings
                    
                1  Call settings
                2  Phone settings
                3  Security settings
                4  Restore factory settings
                0  Back
                
""");

              System.out.print("Select one option: ");
              int settings = input.nextInt();
              
              switch(settings)
              {
                case 1 -> {
                    boolean callSettingsRunning = true;
                    while (callSettingsRunning)
                    {
                  System.out.println("""
                
                        Call settings
                        
                    1   Automatic redial
                    2   Speed dialling
                    3   Call waiting options
                    4   Own number sending
                    5   Phone line in use
                    6   Automatic answer
                    0   Back
                    
              """);
                        
                       System.out.print("Select one option: "); 
                        int callSettings = input.nextInt();
                        
                    switch (callSettings)
                    {
                      case 1 -> System.out.println("Automatic redial");
                      case 2 -> System.out.println("Speed dialling");
                      case 3 -> System.out.println("Call waiting options");
                      case 4 -> System.out.println("Own number sending");
                      case 5 -> System.out.println("Phone line in use");
                      case 6 -> System.out.println("Automatic answer");
                      case 0 -> callSettingsRunning = false;
                      default -> System.out.println("Try again.......");
                      }
                    } 
                  }
                case 2 -> {
                      boolean phoneSettingsRunning = true;
                      while (phoneSettingsRunning)
                      {
                
                
                    System.out.println("""
                
                          Phone settings  
                      1  Language
                      2  Cell info display
                      3  Welcome note
                      4  Network selection
                      5  Confirm SIM service actions
                      0  Back
                      
              """);
                        System.out.print("Select one option: "); 
                        int phoneSettings = input.nextInt();
                        
                    switch (phoneSettings)
                    {
                      case 1 -> System.out.println("Language");
                      case 2 -> System.out.println("Cell info display");
                      case 3 -> System.out.println("Welcome note");
                      case 4 -> System.out.println("Network selection");
                      case 5 -> System.out.println("Confirm SIM service actions");
                      case 0 -> phoneSettingsRunning = false;
                      default -> System.out.println("Try again.......");
                      }
                    } 
                  }
                case 3 -> {
                    boolean securitySettingsRunning = true;
                    while (securitySettingsRunning)
                    {
                System.out.println("""
                
                        Security settings
                    1  PIN code request
                    2  Call barring service
                    3  Fixed dialling
                    4  Closed user group
                    5  Security level
                    6  Change access codes
                    0  Back
                
                """);
                      System.out.print("Select one option: "); 
                        int securitySettings = input.nextInt();
                        
                    switch (securitySettings)
                    {
                      case 1 -> System.out.println("PIN code request");
                      case 2 -> System.out.println("Call barring service");
                      case 3 -> System.out.println("Fixed dialling");
                      case 4 -> System.out.println("Closed user group");
                      case 5 -> System.out.println("Security level");
                      case 6 -> System.out.println("Change access codes");
                      case 0 -> securitySettingsRunning = false;
                      default -> System.out.println("Try again.......");
                      }
                    } 
                  }
                case 4 -> System.out.println("Restore factory settings");
                case 0 -> settingsRunning = false;
                default -> System.out.println("Try again ......");
                }
              }
            }
              case 7 -> System.out.println("Call Divert");
              
              case 8 -> {
                boolean musicRunning = true;
                while (musicRunning)
                {
                
                
                System.out.println("""
              
                    Music
                    
                1  Music player
                2  Radio
                3  Recorder
                4  Track list
                0  Back
                
""");

              System.out.print("Select one option: ");
              int music = input.nextInt();
              
              switch(music)
              {
                case 1 -> System.out.println("Music player");
                case 2 -> System.out.println("Radio");
                case 3 -> System.out.println("Recorder");
                case 4 -> System.out.println("Track list");
                case 0 -> musicRunning = false;
                default -> System.out.println("Try again ......");
                }
              }
              }
              case 9 -> System.out.println("Games");
              
              case 10 -> System.out.println("Calculator");
              
              case 11 -> System.out.println("Reminders");
              
              case 12 -> {
                  boolean clockRunning = true;
                  while (clockRunning)
                  {
              
                  System.out.println("""
                        
                        Clock
                  1  Alarm clock
                  2  Clock settings
                  3  Date setting
                  4  Stopwatch
                  5  Countdown timer
                  6  Auto update of date and time
                  0  Back
                  
""");
              System.out.print("Select one option: ");
              int clock = input.nextInt();
              
              switch(clock)
              {
                case 1 -> System.out.println("Alarm clock");
                case 2 -> System.out.println("Clock settings");
                case 3 -> System.out.println("Date setting");
                case 4 -> System.out.println("Stopwatch");
                case 5 -> System.out.println("Countdown timer");
                case 6 -> System.out.println("Auto update of date and time");
                case 0 -> clockRunning = false;
                default -> System.out.println("Try again ......");
                }
              }
            }  
              case 13 -> System.out.println("Profiles");
              
              case 14 -> System.out.println("Services");
              
              case 15 -> System.out.println("SIM services");
              
              case 0 -> menuRunning = false;
              
              default -> System.out.println("Try again......");
              }
            }
          }
        }           
