import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {
    Bakery bakery;

    @BeforeEach
    void setUp() { bakery = new Bakery();}

    @Test
    void canCountConfectionary () {assertThat (bakery.countConfectionarys()).isEqualTo(0); }

    @Test
    void canAddConfectionary() {
        Wholecake wholecake = new Wholecake("Birthday Cake", "eggless", 5.00, 20.00, 3, "flour, milk, butter, chocolate, food colouring", "Red Velvet", "Cream Cheese frosting", "white chocolate", "heart", 10, 2);
        Confectionary confectionary = null;
        bakery.addConfectionarys(confectionary);
        assertThat(bakery).isEqualTo(3);


        @Testgit 
        void addConfectionary(){
            Wholecake wholecake = new Wholecake("Graduation Cake", "nothing", 10.00, 30.00, 1, "flour, milk, butter, strawberries, food colouring", "Vanilla", "Buttercream", "Jam", "circle", 8, 1);

            Cupcake cupcake = new Cupcake("Mother's Day themed", "vegan", 7.00, 15.00, 1, "flour, vegan butter, vegan milk", "vanilla", "Italian Buttercream", "none", true);
             bakery.addConfectionarys(wholecake);
             bakery.addConfectionarys(cupcake);
            assertThat(bakery.countConfectionarys()).isEqualTo(5);
        }


        @Test
        void canAdd
    }
}


