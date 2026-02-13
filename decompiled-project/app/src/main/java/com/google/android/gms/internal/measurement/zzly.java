package com.google.android.gms.internal.measurement;

import X.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzly {
    public static zzlq zzb(Class cls) {
        String j;
        ClassLoader classLoader = zzly.class.getClassLoader();
        if (cls.equals(zzlq.class)) {
            j = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(zzly.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            j = c.j(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (zzlq) cls.cast(((zzly) Class.forName(j, true, classLoader).getConstructor(null).newInstance(null)).zza());
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            } catch (InstantiationException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzly.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzlq) cls.cast(((zzly) it.next()).zza()));
                } catch (ServiceConfigurationError e13) {
                    Logger.getLogger(zzll.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e13);
                }
            }
            if (arrayList.size() == 1) {
                return (zzlq) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzlq) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(e14);
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(e16);
            }
        }
    }

    public abstract zzlq zza();
}
