package Ga;

import Z9.x;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.kt.apps.media.xemtv.beta.R;
import h3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import v2.C2134f;
import v2.u;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4413b;

    public /* synthetic */ c(Context context, int i7) {
        this.f4412a = i7;
        this.f4413b = context;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [Eb.h, java.lang.Object, Eb.l] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        Object[] objArr;
        switch (this.f4412a) {
            case 0:
                Context it = (Context) obj;
                kotlin.jvm.internal.l.e(it, "it");
                View inflate = LayoutInflater.from(this.f4413b).inflate(R.layout.exo_player, (ViewGroup) null, false);
                kotlin.jvm.internal.l.c(inflate, "null cannot be cast to non-null type com.google.android.exoplayer2.ui.StyledPlayerView");
                StyledPlayerView styledPlayerView = (StyledPlayerView) inflate;
                styledPlayerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return styledPlayerView;
            default:
                Bundle bundle = (Bundle) obj;
                u j = q3.f.j(this.f4413b);
                if (bundle != null) {
                    bundle.setClassLoader(j.f25025a.getClassLoader());
                }
                y2.f fVar = j.f25026b;
                fVar.getClass();
                if (bundle != null) {
                    fVar.f26768d = bundle.containsKey("android-support-nav:controller:navigatorState") ? Y6.b.n("android-support-nav:controller:navigatorState", bundle) : null;
                    fVar.f26769e = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) Y6.b.o("android-support-nav:controller:backStack", bundle).toArray(new Bundle[0]) : null;
                    LinkedHashMap linkedHashMap = fVar.f26774m;
                    linkedHashMap.clear();
                    if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            x.E("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            x.E("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i7 = 0;
                        int i10 = 0;
                        while (i7 < length) {
                            int i11 = i10 + 1;
                            fVar.f26773l.put(Integer.valueOf(intArray[i7]), !kotlin.jvm.internal.l.a(stringArrayList.get(i10), "") ? stringArrayList.get(i10) : null);
                            i7++;
                            i10 = i11;
                        }
                    }
                    if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            x.E("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        for (String str : stringArrayList2) {
                            String key = "android-support-nav:controller:backStackStates:" + str;
                            kotlin.jvm.internal.l.e(key, "key");
                            if (bundle.containsKey(key)) {
                                ArrayList o10 = Y6.b.o("android-support-nav:controller:backStackStates:" + str, bundle);
                                int size = o10.size();
                                ?? hVar = new Eb.h();
                                if (size == 0) {
                                    objArr = Eb.l.f3881d;
                                } else {
                                    if (size <= 0) {
                                        throw new IllegalArgumentException(o.l(size, "Illegal Capacity: "));
                                    }
                                    objArr = new Object[size];
                                }
                                hVar.f3883b = objArr;
                                Iterator it2 = o10.iterator();
                                while (it2.hasNext()) {
                                    hVar.addLast(new C2134f((Bundle) it2.next()));
                                }
                                linkedHashMap.put(str, hVar);
                            }
                        }
                    }
                }
                if (bundle != null) {
                    boolean z8 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z8 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z8) : null;
                    j.f25029e = valueOf != null ? valueOf.booleanValue() : false;
                }
                return j;
        }
    }
}
