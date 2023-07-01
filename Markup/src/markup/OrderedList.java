package markup;

import java.util.List;

public class OrderedList extends AbstractList{

    public OrderedList(List<ListItem> elements) {
        super("!!!", "<ol>", "enumerate", elements);
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        throw new UnsupportedOperationException("Markdown для OrderedList не определён");
    }
}
