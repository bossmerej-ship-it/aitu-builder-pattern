# Car Rental Configuration System (Builder Pattern)

This project demonstrates the implementation of the **Builder creational design pattern** in Java.

## Domain Model
The domain focuses on configuring vehicles with diverse representations (e.g., standard Sedans and performance Sports Cars) using a unified construction interface.

## Pattern Components
- **Product**: `Car` — represents the complex object with attributes like brand, model, color, year, and transmission.
- **Builder Interface**: `CarBuilder` — declares steps for configuring the vehicle and building the final instance using method chaining.
- **Concrete Builders**: 
  - `SedanCarBuilder` — builds sedans with default comfort configurations and strict validations.
  - `SportsCarBuilder` — builds high-performance vehicles with sports defaults.
- **Director**: `CarDirector` — encapsulates predefined recipes (`constructToyotaCamry`, `constructPorsche911`).
- **Client**: `Main` — demonstrates execution via Director presets and direct Fluent API chaining.

## How to Run

With JDK 17 or newer and Maven installed, run these commands from the project root:

```sh
mvn compile
java -cp target/classes com.carrental.Main
```

The demo prints the Toyota Camry and Porsche 911 presets, followed by a custom Hyundai Elantra.

In IntelliJ IDEA, open the project as a Maven project and run `com.carrental.Main.main()`.
