package Eb;

import ac.C0797b;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class m implements Iterable, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3886b;

    public /* synthetic */ m(Object obj, int i7) {
        this.f3885a = i7;
        this.f3886b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3885a) {
            case 0:
                return kotlin.jvm.internal.l.h((Object[]) this.f3886b);
            default:
                return new C0797b((Ob.h) this.f3886b);
        }
    }
}
