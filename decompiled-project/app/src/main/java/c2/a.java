package c2;

import android.app.Fragment;

/* loaded from: classes.dex */
public final class a extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public h f14129a;

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        h hVar = this.f14129a;
        if (hVar != null) {
            hVar.e();
            hVar.f14148c = null;
            hVar.f14153i = false;
            c cVar = hVar.f14149d;
            if (cVar != null) {
                int i7 = cVar.f14135c;
                if (i7 <= 0) {
                    throw new IllegalStateException("Can't unref, count " + cVar.f14135c);
                }
                int i10 = i7 - 1;
                cVar.f14135c = i10;
                if (i10 == 0) {
                    cVar.f14133a = 0;
                    cVar.f14134b = null;
                }
                hVar.f14149d = null;
            }
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        h hVar = this.f14129a;
        if (hVar != null) {
            hVar.d();
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        h hVar = this.f14129a;
        if (hVar != null) {
            hVar.i();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        h hVar = this.f14129a;
        if (hVar != null) {
            hVar.e();
        }
        super.onStop();
    }
}
