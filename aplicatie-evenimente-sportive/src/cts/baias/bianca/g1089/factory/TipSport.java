package cts.baias.bianca.g1089.factory;

public enum TipSport {
    FOTBAL{
        @Override
        public ITransmissionFactory getFactory() {
            return new FotbalFactory();
        }
    },
    BASCHET{
        @Override
        public ITransmissionFactory getFactory() {
            return new BaschetFactory();
        }
    },
    HANDBAL{
        @Override
        public ITransmissionFactory getFactory() {
            return new HandbalFactory();
        }
    };
    public abstract ITransmissionFactory getFactory();
}
