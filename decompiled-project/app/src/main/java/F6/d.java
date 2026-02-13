package F6;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class d extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i10)) {
            return true;
        }
        E6.h hVar = (E6.h) this;
        if (i7 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i11 = e.f4151a;
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
            int dataAvail = parcel.dataAvail();
            if (dataAvail > 0) {
                throw new BadParcelableException(h3.o.l(dataAvail, "Parcel data not fully consumed, unread size: "));
            }
            o oVar = hVar.f3742c.f3746a;
            TaskCompletionSource taskCompletionSource = hVar.f3741b;
            oVar.c(taskCompletionSource);
            hVar.f3740a.c("onRequestInfo", new Object[0]);
            if (bundle.getInt("error.code", -2) != 0) {
                taskCompletionSource.trySetException(new G6.a(bundle.getInt("error.code", -2)));
            } else {
                bundle.getInt("version.code", -1);
                int i12 = bundle.getInt("update.availability");
                bundle.getInt("install.status", 0);
                if (bundle.getInt("client.version.staleness", -1) != -1) {
                    bundle.getInt("client.version.staleness");
                }
                bundle.getInt("in.app.update.priority", 0);
                bundle.getLong("bytes.downloaded");
                bundle.getLong("total.bytes.to.download");
                long j = bundle.getLong("additional.size.required");
                E6.j jVar = hVar.f3743d.f3749d;
                jVar.getClass();
                long a9 = E6.j.a(new File(jVar.f3750a.getFilesDir(), "assetpacks"));
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
                PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
                PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
                PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
                HashMap hashMap = new HashMap();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                HashSet hashSet = new HashSet();
                if (integerArrayList != null) {
                    hashSet.addAll(integerArrayList);
                }
                hashMap.put("blocking.destructive.intent", hashSet);
                ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                HashSet hashSet2 = new HashSet();
                if (integerArrayList2 != null) {
                    hashSet2.addAll(integerArrayList2);
                }
                hashMap.put("nonblocking.destructive.intent", hashSet2);
                ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
                HashSet hashSet3 = new HashSet();
                if (integerArrayList3 != null) {
                    hashSet3.addAll(integerArrayList3);
                }
                hashMap.put("blocking.intent", hashSet3);
                ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                HashSet hashSet4 = new HashSet();
                if (integerArrayList4 != null) {
                    hashSet4.addAll(integerArrayList4);
                }
                hashMap.put("nonblocking.intent", hashSet4);
                taskCompletionSource.trySetResult(new E6.a(i12, j, a9, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, hashMap));
            }
        } else {
            if (i7 != 3) {
                return false;
            }
            Parcelable.Creator creator2 = Bundle.CREATOR;
            int i13 = e.f4151a;
            int dataAvail2 = parcel.dataAvail();
            if (dataAvail2 > 0) {
                throw new BadParcelableException(h3.o.l(dataAvail2, "Parcel data not fully consumed, unread size: "));
            }
            hVar.f3742c.f3746a.c(hVar.f3741b);
            hVar.f3740a.c("onCompleteUpdate", new Object[0]);
        }
        return true;
    }
}
