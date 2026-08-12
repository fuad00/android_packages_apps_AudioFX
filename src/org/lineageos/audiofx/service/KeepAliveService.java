/*
 * SPDX-FileCopyrightText: 2023 The Android Open Source Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.audiofx.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/** Keeps the AudioFX process alive without owning effect sessions or DSP state. */
public class KeepAliveService extends Service {
    private final IBinder mBinder = new Binder();

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
