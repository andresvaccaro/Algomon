package fiuba.algo3.model.ataques;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.accion.ataque.Ataque;
import fiuba.algo3.modelo.accion.ataque.AtaqueRapido;
import fiuba.algo3.modelo.algomon.Algomon;
import fiuba.algo3.modelo.algomon.Bulbasaur;
import fiuba.algo3.modelo.algomon.Chansey;
import fiuba.algo3.modelo.algomon.Charmander;
import fiuba.algo3.modelo.algomon.Rattata;

public class AtaqueRapidoTest {
	
	
	@Test
	public void test1_chanseyLeCausaEfectoArattataYleQuita10PuntosDeVida(){
		
		Ataque ataqueRapido=new AtaqueRapido();
		
		Algomon chansey=new Chansey();
		Algomon rattata=new Rattata();
		
		ataqueRapido.cargarAlgomonQueRealizaLaAccion(chansey);
		ataqueRapido.cargarAtacado(rattata);
		
		ataqueRapido.causarEfecto( rattata, chansey );
		
		assertEquals(160d, ataqueRapido.getAlgomonAtacado().getPuntosDeVida() ,0.000d);
		
	}
	

	@Test
	public void test2_CharmanderAtacaConAtaqueRapidoYleQuita10PuntosDeVidaA_Bulbasaur(){
		
		Ataque ataqueRapido=new AtaqueRapido();
		
		Algomon charmander=new Charmander();
		Algomon bulbasaur=new Bulbasaur();
		
		ataqueRapido.cargarAlgomonQueRealizaLaAccion(charmander);
		ataqueRapido.cargarAtacado(bulbasaur);
		
		assertEquals(140d,bulbasaur.getPuntosDeVida(),0.000d);	
		assertEquals(140d, ataqueRapido.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		
		ataqueRapido.causarEfecto( bulbasaur , charmander );
		
		assertEquals(130d,bulbasaur.getPuntosDeVida(),0.000d);	
		assertEquals(130d, ataqueRapido.getAlgomonAtacado().getPuntosDeVida(),0.000d);
		

	}
}
