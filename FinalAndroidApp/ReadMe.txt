*****This document will tell you how to run this system*****

[Clinet Android App]
    Step 1: The all source code of this Android App is located in this folder "BusAlarmApp"
    Step 2: Compile this source code in your Android Studio and then launch this App in the Android emulator or your Android device.
    Step 3: Choose the all the bus information on the first screen then click the button "Start to Track Bus"
    Step 4: You will see all the bus stops shown on the google map. And you will get the notification when the bus is coming, and your destination stop is arriving.

[Bus Simulator Server]
    Step 1: Assumed you had a Golang compiler environment already. If no, please create it before you run this program.
    Step 2: Open your command window and navigate to this folder "bus_simulator"
    Step 3: type the command "go run bus.go busLineGeoInfo.go". Please note that you might meet error that you lack come package. Don't be panic for it. Just type "go get <YOUR MISSING PACKAGE>" then you will get the fix.
    Step 4: After the bus simulator is launched, please open your browser and go to this URL “http://localhost:3000/sensor-provider/” to open the dashboard.
    Step 5: Enter a GPS sensor name in the dashboard
    Step 6: Select one of the bus line to attach to the dashboard
    Step 7: Click "Add" button in the dashboard
    Step 8: Click "Start All Sensors" button in the dashboard
    Step 9: Click the "Map" button to launch the map page
    Step 10: Check your client Android App to get the notification when your bus is coming, and the end stop is arriving.
    
If you have any question or problem about this program, please feel free to contact me (sun999@gmail.com).
Enjoy!