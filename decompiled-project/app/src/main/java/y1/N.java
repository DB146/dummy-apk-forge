package y1;

import Eb.C0252c;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class N extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public static final N f26650a = new kotlin.jvm.internal.m(1);

    @Override // Rb.c
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new C0252c(viewGroup, 4);
        }
        return null;
    }
}
