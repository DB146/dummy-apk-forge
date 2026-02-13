package m;

import android.view.View;
import android.view.animation.BaseInterpolator;
import h3.H;
import java.util.ArrayList;
import java.util.Iterator;
import y1.S;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1528j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f19677c;

    /* renamed from: d, reason: collision with root package name */
    public H f19678d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19679e;

    /* renamed from: b, reason: collision with root package name */
    public long f19676b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C1527i f19680f = new C1527i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19675a = new ArrayList();

    public final void a() {
        if (this.f19679e) {
            Iterator it = this.f19675a.iterator();
            while (it.hasNext()) {
                ((S) it.next()).b();
            }
            this.f19679e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f19679e) {
            return;
        }
        Iterator it = this.f19675a.iterator();
        while (it.hasNext()) {
            S s3 = (S) it.next();
            long j = this.f19676b;
            if (j >= 0) {
                s3.c(j);
            }
            BaseInterpolator baseInterpolator = this.f19677c;
            if (baseInterpolator != null && (view = (View) s3.f26657a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f19678d != null) {
                s3.d(this.f19680f);
            }
            View view2 = (View) s3.f26657a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f19679e = true;
    }
}
