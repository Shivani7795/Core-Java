package multiclass;

// Main Casting class
public class Casting {

    public void cBike(Bike bike) {
        if (bike != null) {
            bike.move();//???
            if (bike instanceof Pedal) {
                Pedal pedal = (Pedal) bike;
                pedal.rotate();
            } else {
                System.err.println("Pedal is not in Bike");
            }
        } else {
            System.err.println("Bike is null..");
        }
    }
    public void stabilizeShip(Ship ship) {
        if (ship != null) {
            ship.sail();
            if (ship instanceof Anchor) {
                Anchor anchor = (Anchor) ship;
                anchor.stabilize();
            } else {
                System.err.println("Ship is not of type Anchor");
            }
        } else {
            System.err.println("Ship is null..");
        }
    }
    public void editPhoto(Album album) {
        if (album != null) {
            album.size();
            if (album instanceof Photo) {
                Photo photo = (Photo) album;
                photo.edit();
            } else {
                System.err.println("Album is not of type Photo");
            }
        } else {
            System.err.println("Album is null..");
        }
    }
    public void huntTiger(Animal animal) {
        if (animal != null) {
            animal.roam(); // Method from Animal class
            if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal; // Casting
                tiger.hunt(); // Specific method for Tiger
            } else {
                System.err.println("Animal is not of type Tiger");
            }
        } else {
            System.err.println("Animal is null..");
        }
    }
    public void crunchApple(Fruit fruit) {
        if (fruit != null) {
            fruit.taste(); // Method from Fruit class
            if (fruit instanceof Apple) {
                Apple apple = (Apple) fruit; // Casting
                apple.crunch(); // Specific method for Apple
            } else {
                System.err.println("Fruit is not of type Apple");
            }
        } else {
            System.err.println("Fruit is null..");
        }
    }
    public void attackSoldier(Army army) {
        if (army != null) {
            army.defend(); // Method from Army class
            if (army instanceof Soldier) {
                Soldier soldier = (Soldier) army; // Casting
                soldier.attack(); // Specific method for Soldier
            } else {
                System.err.println("Army is not of type Soldier");
            }
        } else {
            System.err.println("Army is null..");
        }
    }
    public void dressUpBarbie(Doll doll) {
        if (doll != null) {
            doll.play(); // Method from Doll class
            if (doll instanceof Barbie) {
                Barbie barbie = (Barbie) doll; // Casting
                barbie.dressUp(); // Specific method for Barbie
            } else {
                System.err.println("Doll is not of type Barbie");
            }
        } else {
            System.err.println("Doll is null..");
        }
    }
    public void hitBat(Cricket cricket) {
        if (cricket != null) {
            cricket.play(); // Method from Cricket class
            if (cricket instanceof Bat) {
                Bat bat = (Bat) cricket; // Casting
                bat.hit(); // Specific method for Bat
            } else {
                System.err.println("Cricket is not of type Bat");
            }
        } else {
            System.err.println("Cricket is null..");
        }
    }
    public void supportBench(Park park) {
        if (park != null) {
            park.relax(); // Method from Park class
            if (park instanceof Bench) {
                Bench bench = (Bench) park; // Casting
                bench.support(); // Specific method for Bench
            } else {
                System.err.println("Park is not of type Bench");
            }
        } else {
            System.err.println("Park is null..");
        }
    }
    public void jeansBelt(Pant pant) {
        if (pant != null) {
            pant.jeans(); // Method from Pant class
            if (pant instanceof Belt) {
                Belt belt = (Belt) pant; // Casting
                belt.Belty(); // Specific method for Belt
            } else {
                System.err.println("Pant is not of type Belt");
            }
        } else {
            System.err.println("Pant is null..");
        }
    }
    public void illuminateBeam(Sun sun) {
        if (sun != null) {
            sun.shine(); // Method from Sun class
            if (sun instanceof Beam) {
                Beam beam = (Beam) sun; // Casting
                beam.illuminate(); // Specific method for Beam
            } else {
                System.err.println("Sun is not of type Beam");
            }
        } else {
            System.err.println("Sun is null..");
        }
    }
    public void threadBead(Bracelete bracelete) {
        if (bracelete != null) {
            bracelete.thread(); // Method from Bracelete class
            if (bracelete instanceof Bead) {
                Bead bead = (Bead) bracelete; // Casting
                bead.Beady(); // Specific method for Bead
            } else {
                System.err.println("Bracelete is not of type Bead");
            }
        } else {
            System.err.println("Bracelete is null..");
        }
    }
    public void scatterSand(Beach beach) {
        if (beach != null) {
            beach.relax(); // Method from Beach class
            if (beach instanceof Sand) {
                Sand sand = (Sand) beach; // Casting
                sand.scatter(); // Specific method for Sand
            } else {
                System.err.println("Beach is not of type Sand");
            }
        } else {
            System.err.println("Beach is null..");
        }
    }
    public void strokePaint(Paint paint) {
        if (paint != null) {
            paint.color(); // Method from Paint class
            if (paint instanceof Brush) {
                Brush brush = (Brush) paint; // Casting
                brush.stroke(); // Specific method for Brush
            } else {
                System.err.println("Paint is not of type Brush");
            }
        } else {
            System.err.println("Paint is null..");
        }
    }
    public void towerSkyline(Skyline skyline) {
        if (skyline != null) {
            skyline.rise(); // Method from Skyline class
            if (skyline instanceof Building) {
                Building building = (Building) skyline; // Casting
                building.tower(); // Specific method for Building
            } else {
                System.err.println("Skyline is not of type Building");
            }
        } else {
            System.err.println("Skyline is null..");
        }
    }
    public void honkVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.drive(); // Method from Vehicle class
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle; // Casting
                car.honk(); // Specific method for Car
            } else {
                System.err.println("Vehicle is not of type Car");
            }
        } else {
            System.err.println("Vehicle is null..");
        }
    }
    public void compoundElements(Elements elements) {
        if (elements != null) {
            elements.bond(); // Method from Elements class
            if (elements instanceof Carbon) {
                Carbon carbon = (Carbon) elements; // Casting
                carbon.compound(); // Specific method for Carbon
            } else {
                System.err.println("Elements is not of type Carbon");
            }
        } else {
            System.err.println("Elements is null..");
        }
    }
    public void crawlButterfly(Butterfly butterfly) {
        if (butterfly != null) {
            butterfly.fly(); // Method from Butterfly class
            if (butterfly instanceof Caterpillar) {
                Caterpillar caterpillar = (Caterpillar) butterfly; // Casting
                caterpillar.crawl(); // Specific method for Caterpillar
            } else {
                System.err.println("Butterfly is not of type Caterpillar");
            }
        } else {
            System.err.println("Butterfly is null..");
        }
    }
    public void broadcastTV(TV tv) {
        if (tv != null) {
            tv.watch(); // Method from TV class
            if (tv instanceof Channel) {
                Channel channel = (Channel) tv; // Casting
                channel.broadcast(); // Specific method for Channel
            } else {
                System.err.println("TV is not of type Channel");
            }
        } else {
            System.err.println("TV is null..");
        }
    }
    public void teachSchool(School school) {
        if (school != null) {
            school.educate(); // Method from School class
            if (school instanceof Classroom) {
                Classroom classroom = (Classroom) school; // Casting
                classroom.teach(); // Specific method for Classroom
            } else {
                System.err.println("School is not of type Classroom");
            }
        } else {
            System.err.println("School is null..");
        }
    }
    public void rainSky(Sky sky) {
        if (sky != null) {
            sky.shine(); // Method from Sky class
            if (sky instanceof Cloud) {
                Cloud cloud = (Cloud) sky; // Casting
                cloud.rain(); // Specific method for Cloud
            } else {
                System.err.println("Sky is not of type Cloud");
            }
        } else {
            System.err.println("Sky is null..");
        }
    }
    public void carryTrain(Train train) {
        if (train != null) {
            train.run(); // Method from Train class
            if (train instanceof Compartment) {
                Compartment compartment = (Compartment) train; // Casting
                compartment.carry(); // Specific method for Compartment
            } else {
                System.err.println("Train is not of type Compartment");
            }
        } else {
            System.err.println("Train is null..");
        }
    }
    public void cottonyPillow(Pillow pillow) {
        if (pillow != null) {
            pillow.square(); // Method from Pillow class
            if (pillow instanceof Cotton) {
                Cotton cotton = (Cotton) pillow; // Casting
                cotton.Cottony(); // Specific method for Cotton
            } else {
                System.err.println("Pillow is not of type Cotton");
            }
        } else {
            System.err.println("Pillow is null..");
        }
    }
    public void harvestField(Field field) {
        if (field != null) {
            field.cultivate(); // Method from Field class
            if (field instanceof Crop) {
                Crop crop = (Crop) field; // Casting
                crop.harvest(); // Specific method for Crop
            } else {
                System.err.println("Field is not of type Crop");
            }
        } else {
            System.err.println("Field is null..");
        }
    }public void meltIce(Ice ice) {
        if (ice != null) {
            ice.freeze(); // Method from Ice class
            if (ice instanceof Cube) {
                Cube cube = (Cube) ice; // Casting
                cube.melt(); // Specific method for Cube
            } else {
                System.err.println("Ice is not of type Cube");
            }
        } else {
            System.err.println("Ice is null..");
        }
    }
    public void frostCake(Cake cake) {
        if (cake != null) {
            cake.bakeCake(); // Method from Cake class
            if (cake instanceof Cupcake) {
                Cupcake cupcake = (Cupcake) cake; // Casting
                cupcake.Frost(); // Specific method for Cupcake
            } else {
                System.err.println("Cake is not of type Cupcake");
            }
        } else {
            System.err.println("Cake is null..");
        }
    }public void fluffSofa(Sofa sofa) {
        if (sofa != null) {
            sofa.relax(); // Method from Sofa class
            if (sofa instanceof Cushion) {
                Cushion cushion = (Cushion) sofa; // Casting
                cushion.fluff(); // Specific method for Cushion
            } else {
                System.err.println("Sofa is not of type Cushion");
            }
        } else {
            System.err.println("Sofa is null..");
        }
    }
    public void sparkleRing(Ring ring) {
        if (ring != null) {
            ring.adorn(); // Method from Ring class
            if (ring instanceof Diamond) {
                Diamond diamond = (Diamond) ring; // Casting
                diamond.sparkle(); // Specific method for Diamond
            } else {
                System.err.println("Ring is not of type Diamond");
            }
        } else {
            System.err.println("Ring is null..");
        }
    }
    public void treatHospital(Hospital hospital) {
        if (hospital != null) {
            hospital.serve(); // Method from Hospital class
            if (hospital instanceof Doctor) {
                Doctor doctor = (Doctor) hospital; // Casting
                doctor.treat(); // Specific method for Doctor
            } else {
                System.err.println("Hospital is not of type Doctor");
            }
        } else {
            System.err.println("Hospital is null..");
        }
    }
    public void serveFood(Food food) {
        if (food != null) {
            food.prepare(); // Method from Food class
            if (food instanceof Dosa) {
                Dosa dosa = (Dosa) food; // Casting
                dosa.serve(); // Specific method for Dosa
            } else {
                System.err.println("Food is not of type Dosa");
            }
        } else {
            System.err.println("Food is null..");
        }
    }
    public void storeDesk(Desk desk) {
        if (desk != null) {
            desk.organize(); // Method from Desk class
            if (desk instanceof Drawer) {
                Drawer drawer = (Drawer) desk; // Casting
                drawer.store(); // Specific method for Drawer
            } else {
                System.err.println("Desk is not of type Drawer");
            }
        } else {
            System.err.println("Desk is null..");
        }
    }
    public void erasePencil(Pencil pencil) {
        if (pencil != null) {
            pencil.write(); // Method from Pencil class
            if (pencil instanceof Eraser) {
                Eraser eraser = (Eraser) pencil; // Casting
                eraser.erase(); // Specific method for Eraser
            } else {
                System.err.println("Pencil is not of type Eraser");
            }
        } else {
            System.err.println("Pencil is null..");
        }
    }
    public void blinkFace(Face face) {
        if (face != null) {
            face.express(); // Method from Face class
            if (face instanceof Eye) {
                Eye eye = (Eye) face; // Casting
                eye.blink(); // Specific method for Eye
            } else {
                System.err.println("Face is not of type Eye");
            }
        } else {
            System.err.println("Face is null..");
        }
    }
    public void protectGarden(Garden garden) {
        if (garden != null) {
            garden.nurture(); // Method from Garden class
            if (garden instanceof Fence) {
                Fence fence = (Fence) garden; // Casting
                fence.protect(); // Specific method for Fence
            } else {
                System.err.println("Garden is not of type Fence");
            }
        } else {
            System.err.println("Garden is null..");
        }
    }







}

