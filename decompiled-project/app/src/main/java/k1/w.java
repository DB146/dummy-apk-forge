package k1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import l1.AbstractC1449a;

/* loaded from: classes.dex */
public final class w implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18804a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f18805b;

    public w(Context context) {
        this.f18805b = context;
    }

    public final void b(ComponentName componentName) {
        Context context = this.f18805b;
        ArrayList arrayList = this.f18804a;
        int size = arrayList.size();
        try {
            for (Intent a9 = f.a(context, componentName); a9 != null; a9 = f.a(context, a9.getComponent())) {
                arrayList.add(size, a9);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public final void i() {
        ArrayList arrayList = this.f18804a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f18805b;
        if (AbstractC1449a.startActivities(context, intentArr, null)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f18804a.iterator();
    }
}
