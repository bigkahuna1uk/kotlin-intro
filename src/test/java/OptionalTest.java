import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Optional.empty;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * OptionalTest
 *
 * @author bigkahuna
 * @since 29/04/2017
 */
public class OptionalTest {

    private Optional<BigDecimal> first;
    private Optional<BigDecimal> second;

    @Before
    public void setup() {
        first = Optional.of(BigDecimal.ONE);
        second = Optional.of(BigDecimal.ONE);
    }

    @Test
    public void returnsResultIfBothPresent() {
        Optional<BigDecimal> result = joinBigDecimalsWithSecondMap(first, second);

        assertThat(result).hasValue(new BigDecimal("2"));
    }

    @Test
    public void returnsResultIfOnlyFirstPresent() {
        Optional<BigDecimal> result = joinBigDecimalsWithSecondMap(first, empty());

        assertThat(result).isEqualTo(first);
    }

    @Test
    public void returnsResultIfOnlySecondPresent() {
        Optional<BigDecimal> result = joinBigDecimalsWithSecondMap(empty(), second);

        assertThat(result).isEqualTo(second);
    }

    @Test
    public void returnsEmptyResultIfBothFirstAndSecondMissing() {
        Optional<BigDecimal> result = joinBigDecimalsWithSecondMap(empty(), empty());

        assertThat(result).isEmpty();
    }

    @Test
    public void returnsResultIfBothPresentUsingReduce() {
        Optional<BigDecimal> result = joinBigDecimalWithReduce(first, second);

        assertThat(result).hasValue(new BigDecimal("2"));
    }

    @Test
    public void returnsResultIfOnlyFirstPresentUsingReduce() {
        Optional<BigDecimal> result = joinBigDecimalWithReduce(first, empty());

        assertThat(result).isEqualTo(first);
    }

    @Test
    public void returnsResultIfOnlySecondPresentUsingReduce() {
        Optional<BigDecimal> result = joinBigDecimalWithReduce(empty(), second);

        assertThat(result).isEqualTo(second);
    }

    @Test
    public void returnsEmptyResultIfBothFirstAndSecondMissingUsingReduce() {
        Optional<BigDecimal> result = joinBigDecimalWithReduce(empty(), empty());

        assertThat(result).isEmpty();
    }


    private Optional<BigDecimal> joinBigDecimalWithReduce(Optional<BigDecimal> first, Optional<BigDecimal> second) {
        return Stream.of(first, second)
                        .filter(Optional::isPresent)
                        .map(Optional::get)
                        .reduce(BigDecimal::add);
    }

    private Optional<BigDecimal> joinBigDecimalsWithSecondMap(Optional<BigDecimal> first, Optional<BigDecimal> second) {
        //	Add	first	and	second,	treating	empty	as	zero,	returning	an	Optional	of	the	sum,
        //	unless	BOTH	are	empty,	in	which	case	return	an	empty	Optional.
        return first.map(b -> second.map(b::add).orElse(b))
                .map(Optional::of)
                .orElse(second);
    }

}
