package markup;

import java.util.List;

public class UnorderedList extends AbstractList {
    public UnorderedList(List<ListItem> elements) {
        super("!!!", "<ul>", "itemize", elements);
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        throw new UnsupportedOperationException("Markdown для UnorderedList не определён");
    }
}
