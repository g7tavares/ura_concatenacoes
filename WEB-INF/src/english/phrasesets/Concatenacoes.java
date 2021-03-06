package english.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 27 DE JANEIRO DE 2022 17:01:10 BRT
 */
public class Concatenacoes extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(20);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: M0284A
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "M0284A", "M0284A.wav", "Ok, perai que eu to vendo aqui que a sua fatura no valor de"); 

		// phrase: M0284B
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "M0284B", "M0284B.wav", "com vencimento dia"); 

		// phrase: M0284C
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "M0284C", "M0284C.wav", "está em aberto, por isso que você está sem sinal SKY, como é a sua primeira fatura pode ter havido algum problema ou você não recebeu, mas a gente consegue resolver rapidinho e restaurar o seu sinal completo, caso queira pagar agora mesmo com o seu cartão de crédito. Pra pagar agora, é só apertar 1. Se não é o 2."); 

		// phrase: 49Reais_NF
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "49Reais_NF", "49Reais_NF.wav", ""); 

		// phrase: 100e_NF
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "100e_NF", "100e_NF.wav", ""); 

		// phrase: e85centavos_F
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "e85centavos_F", "e85centavos_F.wav", ""); 

		// phrase: 27_Novembro_F
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "27_Novembro_F", "27_Novembro_F.wav", ""); 

		// phrase: Fpd_a
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "Fpd_a", "Fpd_a.wav", ""); 

		// phrase: Fpd_b
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "Fpd_b", "Fpd_b.wav", ""); 

		// phrase: Fpd_c
		com.avaya.sce.runtime.Phraseset.addExternalPhrase(PHRASE_MAP, "english.phraseset.Concatenacoes.urlbase", "Fpd_c", "Fpd_c.wav", ""); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 4 DE FEVEREIRO DE 2022 11H9MIN1S BRT
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(Concatenacoes.PHRASE_MAP, phraseName));
	}
}
