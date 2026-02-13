package rc;

import Eb.AbstractC0255f;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class y extends AbstractC0255f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final C1967k[] f24004a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f24005b;

    public y(C1967k[] c1967kArr, int[] iArr) {
        this.f24004a = c1967kArr;
        this.f24005b = iArr;
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        return this.f24004a.length;
    }

    @Override // Eb.AbstractC0250a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1967k) {
            return super.contains((C1967k) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return this.f24004a[i7];
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1967k) {
            return super.indexOf((C1967k) obj);
        }
        return -1;
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1967k) {
            return super.lastIndexOf((C1967k) obj);
        }
        return -1;
    }
}
