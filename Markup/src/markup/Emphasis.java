package markup;

import java.util.List;

public class Emphasis extends AbstractParagraphElement{

    public Emphasis(List<AbstractParagraphElement> elements) {
        super("*", "<em>", "\\emph{", elements);
    }

}
