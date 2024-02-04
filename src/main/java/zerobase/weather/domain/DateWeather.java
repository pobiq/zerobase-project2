package zerobase.weather.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
@Entity(name ="date_weather")
@ToString
public class DateWeather {
    @Id
    private LocalDate date;

    private String weather;
    private String icon;
    private double temperature;
}
