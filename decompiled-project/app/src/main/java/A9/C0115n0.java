package A9;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: A9.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0115n0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1291a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1292b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1293c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f1294d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1295e;

    /* renamed from: f, reason: collision with root package name */
    public RecyclerView f1296f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final C0 f1297h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC0062a f1298i;
    public final C0125p2 j;
    public final C0125p2 k;

    public C0115n0() {
        ArrayList arrayList = new ArrayList();
        this.f1291a = arrayList;
        this.f1292b = Collections.unmodifiableList(arrayList);
        this.f1293c = new int[4];
        this.f1294d = new float[4];
        this.f1295e = new ArrayList(4);
        this.f1297h = new C0(this, 2);
        this.f1298i = new ViewOnLayoutChangeListenerC0062a(this, 2);
        C0125p2 b2 = b("overviewRowTop");
        b2.f1343b = R.id.details_frame;
        this.j = b2;
        C0125p2 b10 = b("overviewRowBottom");
        b10.f1343b = R.id.details_frame;
        b10.f1344c = 1.0f;
        this.k = b10;
    }

    public final V1 a(S1... s1Arr) {
        V1 v12 = s1Arr[0].f958a != null ? new V1() : new V1();
        ArrayList arrayList = v12.f986a;
        arrayList.clear();
        for (S1 s12 : s1Arr) {
            arrayList.add(s12);
        }
        this.f1295e.add(v12);
        return v12;
    }

    public final C0125p2 b(String str) {
        ArrayList arrayList = this.f1291a;
        int size = arrayList.size();
        C0125p2 c0125p2 = new C0125p2(str, size);
        int length = this.f1293c.length;
        if (length == size) {
            int[] iArr = new int[length * 2];
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = this.f1293c[i7];
            }
            this.f1293c = iArr;
        }
        this.f1293c[size] = Integer.MAX_VALUE;
        arrayList.add(c0125p2);
        return c0125p2;
    }

    public final float c() {
        if (this.f1296f == null) {
            return 0.0f;
        }
        return this.g ? r0.getHeight() : r0.getWidth();
    }

    public final void d(int i7, int i10) {
        if (i7 >= this.f1291a.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f1293c[i7] = i10;
    }

    public final void e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1296f;
        if (recyclerView2 == recyclerView) {
            return;
        }
        ViewOnLayoutChangeListenerC0062a viewOnLayoutChangeListenerC0062a = this.f1298i;
        C0 c02 = this.f1297h;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f13680x0;
            if (arrayList != null) {
                arrayList.remove(c02);
            }
            this.f1296f.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0062a);
        }
        this.f1296f = recyclerView;
        if (recyclerView != null) {
            recyclerView.getLayoutManager();
            this.g = androidx.recyclerview.widget.a.P(this.f1296f.getContext(), null, 0, 0).f4611a == 1;
            this.f1296f.j(c02);
            this.f1296f.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0062a);
        }
    }

    public final void f() {
        H2.P p10;
        Iterator it = this.f1292b.iterator();
        while (true) {
            float f4 = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            C0125p2 c0125p2 = (C0125p2) ((Property) it.next());
            c0125p2.getClass();
            RecyclerView recyclerView = this.f1296f;
            H2.i0 H10 = recyclerView == null ? null : recyclerView.H(0);
            int i7 = c0125p2.f1342a;
            if (H10 != null) {
                View findViewById = H10.f4707a.findViewById(c0125p2.f1343b);
                if (findViewById != null) {
                    Rect rect = new Rect(0, 0, findViewById.getWidth(), findViewById.getHeight());
                    recyclerView.offsetDescendantRectToMyCoords(findViewById, rect);
                    float f10 = 0.0f;
                    while (findViewById != recyclerView && findViewById != null) {
                        if (findViewById.getParent() != recyclerView || (p10 = recyclerView.f13654d0) == null || !p10.f()) {
                            float translationX = findViewById.getTranslationX() + f4;
                            f10 = findViewById.getTranslationY() + f10;
                            f4 = translationX;
                        }
                        findViewById = (View) findViewById.getParent();
                    }
                    rect.offset((int) f4, (int) f10);
                    if (this.g) {
                        d(i7, rect.top + ((int) (c0125p2.f1344c * rect.height())));
                    } else {
                        d(i7, rect.left + ((int) (c0125p2.f1344c * rect.width())));
                    }
                }
            } else if (recyclerView == null || recyclerView.getLayoutManager().y() == 0) {
                d(i7, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            } else {
                View D10 = recyclerView.D(recyclerView.getLayoutManager().x(0));
                if ((D10 != null ? recyclerView.L(D10) : null).c() < 0) {
                    d(i7, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                } else {
                    d(i7, Integer.MIN_VALUE);
                }
            }
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1295e;
            if (i10 >= arrayList.size()) {
                return;
            }
            V1 v12 = (V1) arrayList.get(i10);
            if (v12.f986a.size() >= 2) {
                boolean z8 = v12 instanceof U1;
                ArrayList arrayList2 = this.f1291a;
                if (z8) {
                    if (arrayList2.size() >= 2) {
                        int i11 = this.f1293c[0];
                        int i12 = 1;
                        while (i12 < arrayList2.size()) {
                            int i13 = this.f1293c[i12];
                            if (i13 < i11) {
                                Integer valueOf = Integer.valueOf(i12);
                                String name = ((Property) arrayList2.get(i12)).getName();
                                int i14 = i12 - 1;
                                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", valueOf, name, Integer.valueOf(i14), ((Property) arrayList2.get(i14)).getName()));
                            }
                            if (i11 == Integer.MIN_VALUE && i13 == Integer.MAX_VALUE) {
                                int i15 = i12 - 1;
                                throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i15), ((Property) arrayList2.get(i15)).getName(), Integer.valueOf(i12), ((Property) arrayList2.get(i12)).getName()));
                            }
                            i12++;
                            i11 = i13;
                        }
                    }
                } else if (arrayList2.size() >= 2) {
                    float f11 = this.f1294d[0];
                    int i16 = 1;
                    while (i16 < arrayList2.size()) {
                        float f12 = this.f1294d[i16];
                        if (f12 < f11) {
                            Integer valueOf2 = Integer.valueOf(i16);
                            String name2 = ((Property) arrayList2.get(i16)).getName();
                            int i17 = i16 - 1;
                            throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", valueOf2, name2, Integer.valueOf(i17), ((Property) arrayList2.get(i17)).getName()));
                        }
                        if (f11 == -3.4028235E38f && f12 == Float.MAX_VALUE) {
                            int i18 = i16 - 1;
                            throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i18), ((Property) arrayList2.get(i18)).getName(), Integer.valueOf(i16), ((Property) arrayList2.get(i16)).getName()));
                        }
                        i16++;
                        f11 = f12;
                    }
                }
                Number number = null;
                int i19 = 0;
                boolean z10 = false;
                float f13 = 0.0f;
                while (true) {
                    ArrayList arrayList3 = v12.f989d;
                    if (i19 < arrayList3.size()) {
                        X1 x12 = (X1) arrayList3.get(i19);
                        x12.getClass();
                        if (x12 instanceof W1) {
                            if (number == null) {
                                number = v12.a(this);
                            }
                            x12.a(number);
                        } else {
                            if (!z10) {
                                f13 = v12.b(this);
                                z10 = true;
                            }
                            x12.b(f13);
                        }
                        i19++;
                    }
                }
            }
            i10++;
        }
    }
}
