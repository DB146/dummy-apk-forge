package V;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends Eb.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9953a;

    /* renamed from: b, reason: collision with root package name */
    public final c f9954b;

    public /* synthetic */ i(c cVar, int i7) {
        this.f9953a = i7;
        this.f9954b = cVar;
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        switch (this.f9953a) {
            case 0:
                c cVar = this.f9954b;
                cVar.getClass();
                return cVar.f9941b;
            default:
                c cVar2 = this.f9954b;
                cVar2.getClass();
                return cVar2.f9941b;
        }
    }

    @Override // Eb.AbstractC0250a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f9953a) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f9954b;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f9954b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9953a) {
            case 0:
                c cVar = this.f9954b;
                m[] mVarArr = new m[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    mVarArr[i7] = new n(0);
                }
                return new d(cVar.f9940a, mVarArr);
            default:
                c cVar2 = this.f9954b;
                m[] mVarArr2 = new m[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    mVarArr2[i10] = new n(1);
                }
                return new d(cVar2.f9940a, mVarArr2);
        }
    }
}
