package pa;

import android.util.SparseIntArray;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class p extends k {

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f23255D;

    /* renamed from: C, reason: collision with root package name */
    public long f23256C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23255D = sparseIntArray;
        sparseIntArray.put(R.id.card_view, 1);
        sparseIntArray.put(R.id.home_team, 2);
        sparseIntArray.put(R.id.away_team, 3);
        sparseIntArray.put(R.id.match_time, 4);
        sparseIntArray.put(R.id.match_name, 5);
        sparseIntArray.put(R.id.league, 6);
    }

    @Override // J1.k
    public final void b() {
        synchronized (this) {
            this.f23256C = 0L;
        }
    }

    @Override // J1.k
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f23256C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.k
    public final void f() {
        synchronized (this) {
            this.f23256C = 1L;
        }
        j();
    }

    @Override // J1.k
    public final boolean i(int i7, int i10, J1.a aVar) {
        return false;
    }
}
