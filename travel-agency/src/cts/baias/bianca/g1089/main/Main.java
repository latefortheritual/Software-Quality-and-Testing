package cts.baias.bianca.g1089.main;

import cts.baias.bianca.g1089.builder.HolidayPackage;
import cts.baias.bianca.g1089.singleton.LicenseAlreadySetException;
import cts.baias.bianca.g1089.singleton.TourismLicense;

public class Main {
    static TourismLicense ref3;

    public static void main(String[] args) throws InterruptedException {

        TourismLicense ref1 = TourismLicense.getInstance();
        try {
            ref1.setLicenseNumber("TL-2024-RO-001");
        } catch (LicenseAlreadySetException e) {
            System.out.println(e.getMessage());
        }

        TourismLicense ref2 = TourismLicense.getInstance();

        Thread thread = new Thread(() -> {
            ref3 = TourismLicense.getInstance();
        });
        thread.start();
        thread.join();

        System.out.println("ref1 == ref2: " + (ref1 == ref2));
        System.out.println("ref1 == ref3: " + (ref1 == ref3));
        System.out.println("ref2 == ref3: " + (ref2 == ref3));

        //builder
        HolidayPackage p1 = HolidayPackage.getBuilder()
                .transport("Avion - Cluj → Paris")
                .build();

        HolidayPackage p2 = HolidayPackage.getBuilder()
                .transport("Autocar - București → Roma")
                .accommodation("Hotel 4 stele, camera dubla, 7 nopti")
                .build();

        HolidayPackage p3 = HolidayPackage.getBuilder()
                .transport("Avion - București → Barcelona")
                .accommodation("Hotel 5 stele, camera single, 5 nopti")
                .extraActivities("Excursie de grup, vizita muzeu Picasso")
                .build();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}