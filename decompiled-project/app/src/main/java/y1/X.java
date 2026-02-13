package y1;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.datastore.preferences.protobuf.AbstractC0807j;
import ea.C1108c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import q1.C1876b;

/* loaded from: classes.dex */
public final class X extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0807j f26668a;

    /* renamed from: b, reason: collision with root package name */
    public List f26669b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f26670c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f26671d;

    public X(AbstractC0807j abstractC0807j) {
        super(abstractC0807j.f13417a);
        this.f26671d = new HashMap();
        this.f26668a = abstractC0807j;
    }

    public final a0 a(WindowInsetsAnimation windowInsetsAnimation) {
        a0 a0Var = (a0) this.f26671d.get(windowInsetsAnimation);
        if (a0Var == null) {
            a0Var = new a0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                a0Var.f26678a = new Y(windowInsetsAnimation);
            }
            this.f26671d.put(windowInsetsAnimation, a0Var);
        }
        return a0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f26668a.d(a(windowInsetsAnimation));
        this.f26671d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        AbstractC0807j abstractC0807j = this.f26668a;
        a(windowInsetsAnimation);
        abstractC0807j.e();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f26670c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f26670c = arrayList2;
            this.f26669b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l10 = v7.w.l(list.get(size));
            a0 a9 = a(l10);
            fraction = l10.getFraction();
            a9.f26678a.d(fraction);
            this.f26670c.add(a9);
        }
        return this.f26668a.f(p0.h(null, windowInsets), this.f26669b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        AbstractC0807j abstractC0807j = this.f26668a;
        a(windowInsetsAnimation);
        C1108c g = abstractC0807j.g(new C1108c(bounds));
        g.getClass();
        v7.w.o();
        return v7.w.j(((C1876b) g.f16831c).d(), ((C1876b) g.f16830b).d());
    }
}
