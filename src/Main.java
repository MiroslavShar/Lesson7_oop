public class Main {



    public static void main(String[] args) {
        Transformer optimus = new Transformer(0);
        optimus.run();
        System.out.println(optimus.x);
        optimus.run();
        System.out.println(optimus.x);

        Gun gun1 = new Gun();
        Gun gun2 = new Gun();

        optimus = new Transformer(gun1, gun2);

        Autobot optimus2 = new Autobot();
        optimus2.run();
        System.out.println(optimus2.x);

        optimus2.fire();
        System.out.println(optimus2.gunLeft);
        System.out.println(optimus2.gunRight);

        Decepticon megatron = new Decepticon();

        megatron.run();
        System.out.println(megatron.x);
        megatron.fire();
        System.out.println(megatron.gunLeft);
        System.out.println(megatron.gunRight);


    }


}
