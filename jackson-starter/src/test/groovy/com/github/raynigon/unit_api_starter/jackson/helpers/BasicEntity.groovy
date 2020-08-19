package com.github.raynigon.unit_api_starter.jackson.helpers

import com.github.raynigon.unit_api_starter.jackson.annotation.JsonUnit
import com.github.raynigon.unit_api_starter.jackson.annotation.QuantityShape

import javax.measure.Quantity
import javax.measure.quantity.Length
import javax.measure.quantity.Speed
import javax.measure.quantity.Temperature

class BasicEntity {

    public String id

    @JsonUnit(unit = "km/h")
    public Quantity<Speed> speed

    @JsonUnit(unit = "℃", shape = QuantityShape.STRING)
    public Quantity<Temperature> temperature

    @JsonUnit(unit = "km")
    public Quantity<Length> distance
}
