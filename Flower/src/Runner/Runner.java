package Runner;

import external.*;
import internal.*;


public class Runner {
    public static void main(String[] args) {

        Device laptop = new Laptop(); // Using interface as type
        Laptop laptopObj = new Laptop(); // Using implementation class as type
        laptop.deviceInfo();
        laptopObj.deviceInfo();

        Service service = new ElectricityProvider();
        ElectricityProvider serviceObj = new ElectricityProvider();
        service.provideService();
        serviceObj.provideService();

        Employee employee = new Manager();
        Manager managerObj = new Manager();
        employee.employeeDetails();
        managerObj.employeeDetails();

        Transport transport = new Car();
        Car carObj = new Car();
        transport.transportMode();
        carObj.transportMode();

        Location location = new City();
        City cityObj = new City();
        location.locationDetails();
        cityObj.locationDetails();

        Appliance appliance1 = new WashingMachine();
        WashingMachine appliance2 = new WashingMachine();
        appliance1.turnOn();
        appliance1.checkStatus();
        appliance1.turnOff();
        appliance2.turnOn();
        appliance2.checkStatus();
        appliance2.turnOff();

        Bank bank1 = new StateBank();
        StateBank bank2 = new StateBank();
        bank1.depositMoney();
        bank1.checkBalance();
        bank1.withdrawMoney();
        bank2.depositMoney();
        bank2.checkBalance();
        bank2.withdrawMoney();

        Vehicle vehicle1 = new Cars();
        Cars vehicle2 = new Cars();
        vehicle1.startEngine();
        vehicle1.checkFuel();
        vehicle1.stopEngine();
        vehicle2.startEngine();
        vehicle2.checkFuel();
        vehicle2.stopEngine();

        Book book1 = new Novel();
        Novel book2 = new Novel();
        book1.openPage();
        book1.readPage();
        book1.closeBook();
        book2.openPage();
        book2.readPage();
        book2.closeBook();

        Smartphone phone1 = new Samsung();
        Samsung phone2 = new Samsung();
        phone1.makeCall();
        phone1.sendText();
        phone1.browseInternet();
        phone2.makeCall();
        phone2.sendText();
        phone2.browseInternet();

        Animal animal1 = new Dog();
        Dog animal2 = new Dog();
        animal1.eat();
        animal1.sleep();
        animal1.sound();
        animal1.move();
        animal1.reproduce();
        animal2.eat();
        animal2.sleep();
        animal2.sound();
        animal2.move();
        animal2.reproduce();

        Plant plant1 = new Tree();
        Tree plant2 = new Tree();
        plant1.grow();
        plant1.photosynthesize();
        plant1.absorbWater();
        plant1.produceOxygen();
        plant1.bloom();
        plant2.grow();
        plant2.photosynthesize();
        plant2.absorbWater();
        plant2.produceOxygen();
        plant2.bloom();

        BankAccount account1 = new SavingsAccount();
        SavingsAccount account2 = new SavingsAccount();
        account1.deposit();
        account1.withdraw();
        account1.transfer();
        account1.checkBalance();
        account1.viewStatement();
        account2.deposit();
        account2.withdraw();
        account2.transfer();
        account2.checkBalance();
        account2.viewStatement();

        OperatingSystem os1 = new WindowsOS();
        WindowsOS os2 = new WindowsOS();
        os1.boot();
        os1.execute();
        os1.update();
        os1.shutdown();
        os1.restart();
        os2.boot();
        os2.execute();
        os2.update();
        os2.shutdown();
        os2.restart();

        SportsTeam team1 = new FootballTeam();
        FootballTeam team2 = new FootballTeam();
        team1.train();
        team1.playMatch();
        team1.recruitPlayers();
        team1.analyzePerformance();
        team1.holdMeeting();
        team2.train();
        team2.playMatch();
        team2.recruitPlayers();
        team2.analyzePerformance();
        team2.holdMeeting();

                MusicalInstrument instrument1 = new Piano();
                Piano instrument2 = new Piano();
                instrument1.play();
                instrument1.tune();
                instrument1.stop();
                instrument1.adjustVolume();
                instrument1.changeTone();
                instrument1.repair();
                instrument1.clean();
                instrument2.play();
                instrument2.tune();
                instrument2.stop();
                instrument2.adjustVolume();
                instrument2.changeTone();
                instrument2.repair();
                instrument2.clean();

                // PaymentGateway instances
                PaymentGateway payment1 = new PayPal();
                PayPal payment2 = new PayPal();
                payment1.initiateTransaction();
                payment1.cancelTransaction();
                payment1.refund();
                payment1.generateReceipt();
                payment1.authenticate();
                payment1.verifyAccount();
                payment1.settleFunds();
                payment2.initiateTransaction();
                payment2.cancelTransaction();
                payment2.refund();
                payment2.generateReceipt();
                payment2.authenticate();
                payment2.verifyAccount();
                payment2.settleFunds();

                // Browser instances
                Browser browser1 = new Chrome();
                Chrome browser2 = new Chrome();
                browser1.loadPage();
                browser1.refreshPage();
                browser1.saveBookmark();
                browser1.clearCache();
                browser1.openNewTab();
                browser1.closeTab();
                browser1.viewHistory();
                browser2.loadPage();
                browser2.refreshPage();
                browser2.saveBookmark();
                browser2.clearCache();
                browser2.openNewTab();
                browser2.closeTab();
                browser2.viewHistory();

                // Furniture instances
                Furniture furniture1 = new Chair();
                Chair furniture2 = new Chair();
                furniture1.assemble();
                furniture1.disassemble();
                furniture1.polish();
                furniture1.repaint();
                furniture1.replaceParts();
                furniture1.adjustHeight();
                furniture1.measureDimensions();
                furniture2.assemble();
                furniture2.disassemble();
                furniture2.polish();
                furniture2.repaint();
                furniture2.replaceParts();
                furniture2.adjustHeight();
                furniture2.measureDimensions();

                // Game instances
                Game game1 = new Soccer();
                Soccer game2 = new Soccer();
                game1.startGame();
                game1.pauseGame();
                game1.endGame();
                game1.saveProgress();
                game1.loadProgress();
                game1.restartGame();
                game1.viewScore();
                game2.startGame();
                game2.pauseGame();
                game2.endGame();
                game2.saveProgress();
                game2.loadProgress();
                game2.restartGame();
                game2.viewScore();

                Camera cam1 = new DigitalCamera();
                DigitalCamera cam2 = new DigitalCamera();
                cam1.capturePhoto();
                cam1.recordVideo();
                cam1.adjustFocus();
                cam1.changeResolution();
                cam1.zoomIn();
                cam1.zoomOut();
                cam1.enableFlash();
                cam1.disableFlash();
                cam1.preview();
                cam2.capturePhoto();
                cam2.recordVideo();
                cam2.adjustFocus();
                cam2.changeResolution();
                cam2.zoomIn();
                cam2.zoomOut();
                cam2.enableFlash();
                cam2.disableFlash();
                cam2.preview();

                Restaurant rest1 = new FineDining();
                FineDining rest2 = new FineDining();
                rest1.prepareOrder();
                rest1.serveFood();
                rest1.cleanTables();
                rest1.manageReservations();
                rest1.cook();
                rest1.hireStaff();
                rest1.updateMenu();
                rest1.stockInventory();
                rest1.handlePayments();
                rest2.prepareOrder();
                rest2.serveFood();
                rest2.cleanTables();
                rest2.manageReservations();
                rest2.cook();
                rest2.hireStaff();
                rest2.updateMenu();
                rest2.stockInventory();
                rest2.handlePayments();

                Library lib1 = new PublicLibrary();
                PublicLibrary lib2 = new PublicLibrary();
                lib1.borrowBook();
                lib1.returnBook();
                lib1.catalogBooks();
                lib1.issueCard();
                lib1.hostEvent();
                lib1.provideStudyRoom();
                lib1.manageMembership();
                lib1.extendDueDate();
                lib1.chargeLateFee();
                lib2.borrowBook();
                lib2.returnBook();
                lib2.catalogBooks();
                lib2.issueCard();
                lib2.hostEvent();
                lib2.provideStudyRoom();
                lib2.manageMembership();
                lib2.extendDueDate();
                lib2.chargeLateFee();

                Airline airline1 = new CommercialAirline();
                CommercialAirline airline2 = new CommercialAirline();
                airline1.bookTicket();
                airline1.cancelTicket();
                airline1.assignSeats();
                airline1.announceDeparture();
                airline1.provideInFlightMeals();
                airline1.manageBaggage();
                airline1.trackFlightStatus();
                airline1.upgradeSeat();
                airline1.offerDiscount();
                airline2.bookTicket();
                airline2.cancelTicket();
                airline2.assignSeats();
                airline2.announceDeparture();
                airline2.provideInFlightMeals();
                airline2.manageBaggage();
                airline2.trackFlightStatus();
                airline2.upgradeSeat();
                airline2.offerDiscount();

                WeatherStation station1 = new GlobalWeatherStation();
                GlobalWeatherStation station2 = new GlobalWeatherStation();
                station1.measureTemperature();
                station1.measureHumidity();
                station1.measurePressure();
                station1.predictRainfall();
                station1.issueWarnings();
                station1.recordWindSpeed();
                station1.updateForecast();
                station1.analyzeData();
                station1.shareReport();
                station2.measureTemperature();
                station2.measureHumidity();
                station2.measurePressure();
                station2.predictRainfall();
                station2.issueWarnings();
                station2.recordWindSpeed();
                station2.updateForecast();
                station2.analyzeData();
                station2.shareReport();

    }
}


