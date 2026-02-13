package T1;

import android.text.Editable;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9200a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f9201b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f9202c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f9202c;
        return cls != null ? new S1.d(cls, charSequence) : super.newEditable(charSequence);
    }
}
