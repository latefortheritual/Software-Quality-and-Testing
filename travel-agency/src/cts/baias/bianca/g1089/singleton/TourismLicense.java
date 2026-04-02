package cts.baias.bianca.g1089.singleton;

public class TourismLicense implements AbstractTourismLicense{
    private static TourismLicense instance = new TourismLicense();
    private String licenseNumber;
    private boolean licenseSet = false;

    private TourismLicense() {
        this.licenseNumber = null;
    }

    public static TourismLicense getInstance(){
        return instance;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public void setLicenseNumber(String licenseNumber) throws LicenseAlreadySetException {
        if (licenseSet) {
            throw new LicenseAlreadySetException(
                    "Licența a fost deja setată și nu mai poate fi modificată!"
            );
        }
        this.licenseNumber = licenseNumber;
        this.licenseSet = true;

    }
}
