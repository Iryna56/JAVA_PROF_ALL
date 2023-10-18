package de.telran.baibak.iryna.cw3;

public class JumpTest {
    public static void main(String[] args) {
        Person person = new Person();
        Frog frog = new Frog();

        Jumpable[] jumps = new Jumpable[2];
        jumps[0] = person;
        jumps[1] = frog;
    }
}
