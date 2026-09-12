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
1. Open the project in IntelliJ IDEA (JDK 17+).
2. Run `com.carrental.Main.main()`.
