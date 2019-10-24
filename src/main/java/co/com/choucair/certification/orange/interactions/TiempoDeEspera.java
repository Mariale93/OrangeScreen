package co.com.choucair.certification.orange.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static co.com.choucair.certification.orange.util.TiempoUtilidad.succesfulCondition;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TiempoDeEspera implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
            try {
                Awaitility.await().forever().pollInterval(10000, TimeUnit.MILLISECONDS).until(succesfulCondition());
            }catch (Exception e){
                e.getMessage();
            }
        }
        public static TiempoDeEspera aMoment(){
            return instrumented(TiempoDeEspera.class);
        }
    }

