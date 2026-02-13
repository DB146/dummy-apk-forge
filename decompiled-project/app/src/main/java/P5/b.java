package P5;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;
import h3.o;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b extends zzb implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8162a;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f8162a = obj;
    }

    public static Object F(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f8162a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 != 1) {
            throw new IllegalArgumentException(o.l(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        G.g(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.common.zza, P5.a] */
    public static a h(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new zza(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }
}
