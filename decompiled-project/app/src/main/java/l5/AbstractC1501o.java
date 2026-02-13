package l5;

import android.text.Html;
import java.util.regex.Pattern;

/* renamed from: l5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1501o {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f19533a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f19533a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
