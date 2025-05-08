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
            butterfly.fly();
            if (butterfly instanceof Caterpillar) {
                Caterpillar caterpillar = (Caterpillar) butterfly;
                caterpillar.crawl();
            } else {
                System.err.println("Butterfly is not of type Caterpillar");
            }
        } else {
            System.err.println("Butterfly is null..");
        }
    }
    public void broadcastTV(TV tv) {
        if (tv != null) {
            tv.watch();
            if (tv instanceof Channel) {
                Channel channel = (Channel) tv;
                channel.broadcast();
            } else {
                System.err.println("TV is not of type Channel");
            }
        } else {
            System.err.println("TV is null..");
        }
    }
    public void teachSchool(School school) {
        if (school != null) {
            school.educate();
            if (school instanceof Classroom) {
                Classroom classroom = (Classroom) school;
                classroom.teach();
            } else {
                System.err.println("School is not of type Classroom");
            }
        } else {
            System.err.println("School is null..");
        }
    }
    public void rainSky(Sky sky) {
        if (sky != null) {
            sky.shine();
            if (sky instanceof Cloud) {
                Cloud cloud = (Cloud) sky;
                cloud.rain();
            } else {
                System.err.println("Sky is not of type Cloud");
            }
        } else {
            System.err.println("Sky is null..");
        }
    }
    public void carryTrain(Train train) {
        if (train != null) {
            train.run();
            if (train instanceof Compartment) {
                Compartment compartment = (Compartment) train;
                compartment.carry();
            } else {
                System.err.println("Train is not of type Compartment");
            }
        } else {
            System.err.println("Train is null..");
        }
    }
    public void cottonyPillow(Pillow pillow) {
        if (pillow != null) {
            pillow.square();
            if (pillow instanceof Cotton) {
                Cotton cotton = (Cotton) pillow;
                cotton.Cottony();
            } else {
                System.err.println("Pillow is not of type Cotton");
            }
        } else {
            System.err.println("Pillow is null..");
        }
    }
    public void harvestField(Field field) {
        if (field != null) {
            field.cultivate();
            if (field instanceof Crop) {
                Crop crop = (Crop) field;
                crop.harvest();
            } else {
                System.err.println("Field is not of type Crop");
            }
        } else {
            System.err.println("Field is null..");
        }
    }public void meltIce(Ice ice) {
        if (ice != null) {
            ice.freeze();
            if (ice instanceof Cube) {
                Cube cube = (Cube) ice;
                cube.melt();
            } else {
                System.err.println("Ice is not of type Cube");
            }
        } else {
            System.err.println("Ice is null..");
        }
    }
    public void frostCake(Cake cake) {
        if (cake != null) {
            cake.bakeCake();
            if (cake instanceof Cupcake) {
                Cupcake cupcake = (Cupcake) cake;
                cupcake.Frost();
            } else {
                System.err.println("Cake is not of type Cupcake");
            }
        } else {
            System.err.println("Cake is null..");
        }
    }public void fluffSofa(Sofa sofa) {
        if (sofa != null) {
            sofa.relax();
            if (sofa instanceof Cushion) {
                Cushion cushion = (Cushion) sofa;
                cushion.fluff();
            } else {
                System.err.println("Sofa is not of type Cushion");
            }
        } else {
            System.err.println("Sofa is null..");
        }
    }
    public void sparkleRing(Ring ring) {
        if (ring != null) {
            ring.adorn();
            if (ring instanceof Diamond) {
                Diamond diamond = (Diamond) ring;
                diamond.sparkle();
            } else {
                System.err.println("Ring is not of type Diamond");
            }
        } else {
            System.err.println("Ring is null..");
        }
    }
    public void treatHospital(Hospital hospital) {
        if (hospital != null) {
            hospital.serve();
            if (hospital instanceof Doctor) {
                Doctor doctor = (Doctor) hospital;
                doctor.treat();
            } else {
                System.err.println("Hospital is not of type Doctor");
            }
        } else {
            System.err.println("Hospital is null..");
        }
    }
    public void serveFood(Food food) {
        if (food != null) {
            food.prepare();
            if (food instanceof Dosa) {
                Dosa dosa = (Dosa) food;
                dosa.serve(); 
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

    public void protectPond(Pond pond) {
            if (pond != null) {
                pond.reflect();
                if (pond instanceof Lily) {
                    Lily lily = (Lily) pond;
                    lily.bloom();
                } else {
                    System.err.println("Pond is not of type Lily");
                }
            } else {
                System.err.println("Pond is null..");
            }
        }

        public void protectCamera(Camera camera) {
            if (camera != null) {
                camera.capture();
                if (camera instanceof Lens) {
                    Lens lens = (Lens) camera;
                    lens.zoom();
                } else {
                    System.err.println("Camera is not of type Lens");
                }
            } else {
                System.err.println("Camera is null..");
            }
        }

        public void protectDress(Dress dress) {
            if (dress != null) {
                dress.wear();
                if (dress instanceof Lehenga) {
                    Lehenga lehenga = (Lehenga) dress;
                    lehenga.twirl();
                } else {
                    System.err.println("Dress is not of type Lehenga");
                }
            } else {
                System.err.println("Dress is null..");
            }
        }

        public void protectKingdom(Kingdom kingdom) {
            if (kingdom != null) {
                kingdom.rule();
                if (kingdom instanceof King) {
                    King king = (King) kingdom;
                    king.crown();
                } else {
                    System.err.println("Kingdom is not of type King");
                }
            } else {
                System.err.println("Kingdom is null..");
            }
        }

        public void protectLaptop(Laptop laptop) {
            if (laptop != null) {
                laptop.compute();
                if (laptop instanceof Keyboard) {
                    Keyboard keyboard = (Keyboard) laptop;
                    keyboard.type();
                } else {
                    System.err.println("Laptop is not of type Keyboard");
                }
            } else {
                System.err.println("Laptop is null..");
            }
        }

        public void protectElectric(Electric electric) {
            if (electric != null) {
                electric.powerOn();
                if (electric instanceof Iron) {
                    Iron iron = (Iron) electric;
                    iron.press();
                } else {
                    System.err.println("Electric is not of type Iron");
                }
            } else {
                System.err.println("Electric is null..");
            }
        }

        public void protectPen(Pen pen) {
            if (pen != null) {
                pen.write();
                if (pen instanceof Ink) {
                    Ink ink = (Ink) pen;
                    ink.refill();
                } else {
                    System.err.println("Pen is not of type Ink");
                }
            } else {
                System.err.println("Pen is null..");
            }
        }

        public void protectVillage(Village village) {
            if (village != null) {
                village.exist();
                if (village instanceof Hut) {
                    Hut hut = (Hut) village;
                    hut.shelter();
                } else {
                    System.err.println("Village is not of type Hut");
                }
            } else {
                System.err.println("Village is null..");
            }
        }

        public void protectClock(Clock clock) {
            if (clock != null) {
                clock.tick();
                if (clock instanceof Hand) {
                    Hand hand = (Hand) clock;
                    hand.point();
                } else {
                    System.err.println("Clock is not of type Hand");
                }
            } else {
                System.err.println("Clock is null..");
            }
        }

        public void protectHairstyle(Hairstyle hairstyle) {
            if (hairstyle != null) {
                hairstyle.style();
                if (hairstyle instanceof Hair) {
                    Hair hair = (Hair) hairstyle;
                    hair.comb();
                } else {
                    System.err.println("Hairstyle is not of type Hair");
                }
            } else {
                System.err.println("Hairstyle is null..");
            }
        }

        public void protectMalabar(Malabar malabar) {
            if (malabar != null) {
                malabar.trade();
                if (malabar instanceof Gold) {
                    Gold gold = (Gold) malabar;
                    gold.purity();
                } else {
                    System.err.println("Malabar is not of type Gold");
                }
            } else {
                System.err.println("Malabar is null..");
            }
        }
}







