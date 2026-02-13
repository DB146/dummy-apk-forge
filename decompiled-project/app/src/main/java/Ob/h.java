package Ob;

import ac.C0797b;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class h implements Zb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7552a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7553b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7554c;

    public h(Rb.a aVar, Rb.c cVar) {
        this.f7553b = aVar;
        this.f7554c = cVar;
    }

    public h(File file) {
        i iVar = i.f7555a;
        this.f7553b = file;
        this.f7554c = iVar;
    }

    public h(CharSequence input, Rb.e eVar) {
        l.e(input, "input");
        this.f7553b = input;
        this.f7554c = eVar;
    }

    @Override // Zb.g
    public final Iterator iterator() {
        switch (this.f7552a) {
            case 0:
                return new f(this);
            case 1:
                return new W.c(this);
            default:
                return new C0797b(this);
        }
    }
}
