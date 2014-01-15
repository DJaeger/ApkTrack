/*
 * Copyright (c) 2014
 *
 * ApkTrack is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ApkTrack is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ApkTrack.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.kwiatkowski.ApkTrack;

import android.graphics.drawable.Drawable;

public class InstalledApp implements Comparable<InstalledApp>
{
    private String package_name;
    private String display_name;
    private String version;
    private String latest_version = null;
    private Drawable icon;
    private boolean last_ckeck_error = false;

    private String last_check_date;

    public InstalledApp(String package_name, String version, String display_name, Drawable icon)
    {
        this.package_name = package_name;
        this.version = version;
        this.display_name = display_name;
        this.icon = icon;
    }

    public String getPackageName() {
        return package_name;
    }

    public void setPackageName(String package_name) {
        this.package_name = package_name;
    }

    public String getDisplayName() {
        return display_name;
    }

    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public void setLatestVersion(String latest_version) {
        this.latest_version = latest_version;
    }

    public String getLatestVersion() {
        return latest_version;
    }

    public String getLastCheckDate() {
        return last_check_date;
    }

    public void setLastCheckDate(String last_check_date) {
        this.last_check_date = last_check_date;
    }

    public boolean isLastCheckError() {
        return last_ckeck_error;
    }

    public void setLastCheckError(boolean last_ckeck_error) {
        this.last_ckeck_error = last_ckeck_error;
    }

    @Override
    public int compareTo(InstalledApp installedApp) {
        return display_name.compareTo(installedApp.display_name);
    }
}
