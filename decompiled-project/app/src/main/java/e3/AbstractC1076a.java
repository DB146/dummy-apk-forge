package e3;

import W1.C;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1076a {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f16707a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    public DataSetObserver f16708b;

    public abstract void a(int i7, C c10);

    public abstract void b();

    public abstract int c();

    public int d(C c10) {
        return -1;
    }

    public abstract CharSequence e(int i7);

    public final void f() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f16708b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16707a.notifyChanged();
    }

    public abstract void g(Parcelable parcelable, ClassLoader classLoader);

    public abstract void h(AbstractC1084i abstractC1084i);
}
