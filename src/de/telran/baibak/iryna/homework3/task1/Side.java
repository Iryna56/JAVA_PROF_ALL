package de.telran.baibak.iryna.homework3.task1;

public enum Side {
    EAST("восток"), WEST("запад"), NORTH("север"), SOUTH("юг");
    private String translation;
    Side(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public static void main(String[] args) {
        Side[] values = Side.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].ordinal());
            System.out.println(values[i] + " = " + values[i].getTranslation());
        }
        Side west = Side.valueOf("WEST");
        System.out.println(west.getTranslation());
        Side south = Side.valueOf("SOUTH");
        System.out.println(south.getTranslation());

    }


}
