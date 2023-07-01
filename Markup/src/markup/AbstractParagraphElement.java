package markup;

import java.util.List;

public abstract class AbstractParagraphElement extends AbstractElement implements ParagraphElement{
    protected AbstractParagraphElement(String highlighterBase, String highlighterHtml, String highlighterTex, List<AbstractParagraphElement> elements) {
        super(highlighterBase, highlighterHtml, highlighterTex, elements);
    }
}
