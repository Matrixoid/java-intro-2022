package markup;

import java.util.List;

public class Strikeout extends AbstractParagraphElement {

    public Strikeout(List<AbstractParagraphElement> elements) {
        super("~", "<s>", "\\textst{", elements);
    }

}
