/**
 * Last generated by Orchestration Designer at: 27 DE JANEIRO DE 2022 17:55:45 BRT
 */
package english.prompts;

public class PptConcatenacao extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for PptConcatenacao.
	 */
	public PptConcatenacao() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 28 DE JANEIRO DE 2022 14H47MIN34S BRT
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("PptConcatenacao");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

		add(1, new com.avaya.sce.runtime.PhraseVariableElement("CONCATENACAO", com.avaya.sce.runtime.PhraseVariableElement.Type.PHRASESET_PHRASE,false));

	}
}
