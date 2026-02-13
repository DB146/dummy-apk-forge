package W1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import f.C1117a;
import f.C1125i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l1.AbstractC1449a;

/* loaded from: classes.dex */
public final class O extends com.bumptech.glide.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10333b;

    public /* synthetic */ O(int i7) {
        this.f10333b = i7;
    }

    @Override // com.bumptech.glide.c
    public R7.a E(Context context, Object obj) {
        switch (this.f10333b) {
            case 1:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.l.e(input, "input");
                if (input.length == 0) {
                    return new R7.a(Eb.w.f3892a, 26);
                }
                for (String str : input) {
                    if (AbstractC1449a.checkSelfPermission(context, str) != 0) {
                        return null;
                    }
                }
                int F10 = Eb.B.F(input.length);
                if (F10 < 16) {
                    F10 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F10);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new R7.a(linkedHashMap, 26);
            case 2:
                String input2 = (String) obj;
                kotlin.jvm.internal.l.e(input2, "input");
                if (AbstractC1449a.checkSelfPermission(context, input2) == 0) {
                    return new R7.a(Boolean.TRUE, 26);
                }
                return null;
            default:
                return super.E(context, obj);
        }
    }

    @Override // com.bumptech.glide.c
    public final Object L(int i7, Intent intent) {
        switch (this.f10333b) {
            case 0:
                return new C1117a(i7, intent);
            case 1:
                Eb.w wVar = Eb.w.f3892a;
                if (i7 != -1 || intent == null) {
                    return wVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return wVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i10 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i10 == 0));
                }
                ArrayList X10 = Eb.n.X(stringArrayExtra);
                Iterator it = X10.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(Eb.p.S(X10, 10), Eb.p.S(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new Db.j(it.next(), it2.next()));
                }
                return Eb.B.K(arrayList2);
            case 2:
                if (intent == null || i7 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z8 = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            if (intArrayExtra2[i11] == 0) {
                                z8 = true;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z8);
            default:
                return new C1117a(i7, intent);
        }
    }

    @Override // com.bumptech.glide.c
    public final Intent p(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f10333b) {
            case 0:
                C1125i c1125i = (C1125i) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c1125i.f16919b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c1125i = new C1125i(c1125i.f16918a, null, c1125i.f16920c, c1125i.f16921d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c1125i);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.l.e(input, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                kotlin.jvm.internal.l.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 2:
                String input2 = (String) obj;
                kotlin.jvm.internal.l.e(input2, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input2});
                kotlin.jvm.internal.l.d(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
            default:
                Intent input3 = (Intent) obj;
                kotlin.jvm.internal.l.e(input3, "input");
                return input3;
        }
    }
}
