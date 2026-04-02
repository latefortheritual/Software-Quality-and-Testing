package cts.baias.bianca.g1089.builder;

public class HolidayPackage implements AbstractHolidayPackage{
    //campuri optionale
    private final String transport;
    private final String accommodation;
    private final String extraActivities;

    private HolidayPackage(String transport, String accommodation, String extraActivities) {
        this.transport = transport;
        this.accommodation = accommodation;
        this.extraActivities = extraActivities;
    }

    @Override
    public String getTransport() {
        return transport;
    }

    @Override
    public String getAccommodation() {
        return accommodation;
    }

    @Override
    public String getExtraActivities() {
        return extraActivities;
    }

    @Override
    public String toString() {
        return "HolidayPackage{" +
                "transport='" + transport + '\'' +
                ", accommodation='" + accommodation + '\'' +
                ", extraActivities='" + extraActivities + '\'' +
                '}';
    }

    public static IBuilder getBuilder() {
        return new HolidayPackageBuilder();
    }

    private static class HolidayPackageBuilder implements IBuilder {

        private String transport;
        private String accommodation;
        private String extraActivities;

        private HolidayPackageBuilder() {}

        @Override
        public IBuilder transport(String transport) {
            this.transport = transport;
            return this;
        }

        @Override
        public IBuilder accommodation(String accommodation) {
            this.accommodation = accommodation;
            return this;
        }

        @Override
        public IBuilder extraActivities(String extraActivities) {
            this.extraActivities = extraActivities;
            return this;
        }

        @Override
        public HolidayPackage build() {
            HolidayPackage holidayPackageRezultat = new HolidayPackage( transport,  accommodation,  extraActivities);
            this.transport = null;
            this.accommodation = null;
            this.extraActivities = null;
            return holidayPackageRezultat;
        }
    }
}
