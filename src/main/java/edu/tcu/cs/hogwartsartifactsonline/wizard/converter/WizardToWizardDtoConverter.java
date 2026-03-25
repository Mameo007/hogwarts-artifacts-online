package edu.tcu.cs.hogwartsartifactsonline.wizard.converter;

import edu.tcu.cs.hogwartsartifactsonline.wizard.Wizard;
import edu.tcu.cs.hogwartsartifactsonline.wizard.dto.WizardDto;
import jakarta.persistence.Converter;
import org.springframework.stereotype.Component;

@Component
public class WizardToWizardDtoConverter implements Converter<Wizard, WizardDto> {

    @Override
    public WizardDto convert(Wizard source) {


        WizardDto wizardDto = new WizardDto(source.getId(),
                                            source.getName(),
                                            source.getArtifacts().size());
        return wizardDto;
    }
}
