package y1;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class I {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C2359g b(View view, C2359g c2359g) {
        ContentInfo g = c2359g.f26697a.g();
        Objects.requireNonNull(g);
        ContentInfo performReceiveContent = view.performReceiveContent(g);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g ? c2359g : new C2359g(new o7.o(performReceiveContent));
    }
}
