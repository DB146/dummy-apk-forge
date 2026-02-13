package U7;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f9819a;

    /* renamed from: b, reason: collision with root package name */
    public int f9820b;

    @Override // U7.b
    public boolean a(byte[] bArr) {
        this.f9819a.add(bArr);
        this.f9820b += bArr.length;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [D9.a, java.lang.Object] */
    @Override // U7.b
    public D9.a b() {
        byte[] bArr = new byte[this.f9820b];
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9819a;
            if (i7 >= arrayList.size()) {
                return new Object();
            }
            byte[] bArr2 = (byte[]) arrayList.get(i7);
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
            i7++;
        }
    }

    public synchronized List c() {
        return Collections.unmodifiableList(new ArrayList(this.f9819a));
    }

    public synchronized boolean d(List list) {
        this.f9819a.clear();
        if (list.size() <= this.f9820b) {
            return this.f9819a.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f9820b, null);
        return this.f9819a.addAll(list.subList(0, this.f9820b));
    }
}
